package main;

import com.google.gson.*;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/UlfptcaAlarmInqireSvc/getUlfptcaAlarmInfo"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=PGt0%2FEoIUaz1k6koseZ47H54t5x%2BtUV0Z2WJdpqDC0iph13KpzT9T11MKgOIb5Aq2TGW5Wr994LgUbU85nOFHw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("year","UTF-8") + "=" + URLEncoder.encode("2024", "UTF-8")); /*측정 연도*/
        urlBuilder.append("&" + URLEncoder.encode("itemCode","UTF-8") + "=" + URLEncoder.encode("PM10", "UTF-8")); /*미세먼지 항목 구분(PM10, PM25), PM10/PM25 모두 조회할 경우 파라미터 생략*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());



        //JSON 문자열 -> 자바 객체 변환
        Gson gson = new Gson();

        TempVo tempVo = gson.fromJson(sb.toString(), TempVo.class);
        List<ItemVo> itemList = tempVo.getResponse().getBody().getItems();

        Connection dbConn = JDBCTemplate.getConnection();
        for (ItemVo itemVo : itemList) {
            //INSERT 쿼리 실행
            String sql = "INSERT INTO AIR_KOREA(DISTRICT_NAME, ISSUE_GBN) VALUES(?, ?)";
            PreparedStatement pstmt = dbConn.prepareStatement(sql);
            pstmt.setString(1, itemVo.getDistriceName());
            pstmt.setString(2, itemVo.getIssueGbn());
            int result = pstmt.executeUpdate();
            System.out.println("result = " + result);
        }


//        ChatGpt
//        // JSON 파싱
//        JsonElement jsonElement = JsonParser.parseString(sb.toString());
//        JsonObject jsonObject = jsonElement.getAsJsonObject();
//        JsonArray items = jsonObject.getAsJsonObject("response").getAsJsonObject("body").getAsJsonArray("items");
//
//        // DB 연결
//        Connection dbConn = JDBCTemplate.getConnection();
//
//        for (JsonElement item : items) {
//            JsonObject obj = item.getAsJsonObject();
//            String districtName = obj.get("districtName").getAsString();
//            String issueGbn = obj.get("issueGbn").getAsString();
//
//            // SQL 삽입
//            String sql = "INSERT INTO AIR_KOREA(DISTRICT_NAME , ISSUE_GBN) VALUES(?, ?)";
//            PreparedStatement pstmt = dbConn.prepareStatement(sql);
//            pstmt.setString(1, districtName);
//            pstmt.setString(2, issueGbn);
//            int result = pstmt.executeUpdate();
//            System.out.println("result = " + result);
//        }
//
//        dbConn.close();



    }
}
