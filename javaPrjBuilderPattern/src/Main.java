public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        BoardVo vo =  BoardVo.builder()
                        .title("타이틀")
                        .content("컨텐트")
                        .build();
    }
}