package main;

public class TempVo {

    private ResponseVo response;

    public ResponseVo getResponse() {
        return response;
    }

    public void setResponse(ResponseVo response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "TempVo{" +
                "response='" + response + '\'' +
                '}';
    }
}
