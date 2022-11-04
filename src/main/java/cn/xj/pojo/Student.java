package cn.xj.pojo;

public class Student {
    private String sno;

    private String sname;

    private String ssex;

    private String sage;

    private String sdept;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage == null ? null : sage.trim();
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept == null ? null : sdept.trim();
    }
}