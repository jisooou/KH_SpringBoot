package main;

public class ResponseVo {

    private BodyVo body;
    private HeaderVo header;

    public BodyVo getBody() {
        return body;
    }

    public void setBody(BodyVo body) {
        this.body = body;
    }

    public HeaderVo getHeader() {
        return header;
    }

    public void setHeader(HeaderVo header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "body=" + body +
                ", header=" + header +
                '}';
    }
}
