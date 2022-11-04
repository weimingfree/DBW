package cn.xj.pojo;

public class AdminPw {
    private String aid;

    private String apw;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getApw() {
        return apw;
    }

    public void setApw(String apw) {
        this.apw = apw == null ? null : apw.trim();
    }
}