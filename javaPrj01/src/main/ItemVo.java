package main;

public class ItemVo {

    private String districeName;
    private String issueGbn;

    public String getDistriceName() {
        return districeName;
    }

    public void setDistriceName(String districeName) {
        this.districeName = districeName;
    }

    public String getIssueGbn() {
        return issueGbn;
    }

    public void setIssueGbn(String issueGbn) {
        this.issueGbn = issueGbn;
    }

    @Override
    public String toString() {
        return "ItemVo{" +
                "districeName='" + districeName + '\'' +
                ", issueGbn='" + issueGbn + '\'' +
                '}';
    }
}
