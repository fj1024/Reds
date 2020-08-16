package com.redtravel.bean;

public class Poorer {
    private Integer poorerid;

    private String poorername;

    private String poorerlocation;

    private String poorerdetail;

    private String poorerpicture;

    private String poorerlevel;

    public Integer getPoorerid() {
        return poorerid;
    }

    public void setPoorerid(Integer poorerid) {
        this.poorerid = poorerid;
    }

    public String getPoorername() {
        return poorername;
    }

    public void setPoorername(String poorername) {
        this.poorername = poorername == null ? null : poorername.trim();
    }

    public String getPoorerlocation() {
        return poorerlocation;
    }

    public void setPoorerlocation(String poorerlocation) {
        this.poorerlocation = poorerlocation == null ? null : poorerlocation.trim();
    }

    public String getPoorerdetail() {
        return poorerdetail;
    }

    public void setPoorerdetail(String poorerdetail) {
        this.poorerdetail = poorerdetail == null ? null : poorerdetail.trim();
    }

    public String getPoorerpicture() {
        return poorerpicture;
    }

    public void setPoorerpicture(String poorerpicture) {
        this.poorerpicture = poorerpicture == null ? null : poorerpicture.trim();
    }

    public String getPoorerlevel() {
        return poorerlevel;
    }

    public void setPoorerlevel(String poorerlevel) {
        this.poorerlevel = poorerlevel == null ? null : poorerlevel.trim();
    }
}