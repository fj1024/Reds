package com.redtravel.bean;

public class Commodity {
    private Integer commodityid;

    private String commodityname;

    private Integer commodityprice;

    private String commoditypicture;

    private String commoditylocation;

    private String commodityremark;

    private String commoditydetail;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(Integer commodityprice) {
        this.commodityprice = commodityprice;
    }

    public String getCommoditypicture() {
        return commoditypicture;
    }

    public void setCommoditypicture(String commoditypicture) {
        this.commoditypicture = commoditypicture == null ? null : commoditypicture.trim();
    }

    public String getCommoditylocation() {
        return commoditylocation;
    }

    public void setCommoditylocation(String commoditylocation) {
        this.commoditylocation = commoditylocation == null ? null : commoditylocation.trim();
    }

    public String getCommodityremark() {
        return commodityremark;
    }

    public void setCommodityremark(String commodityremark) {
        this.commodityremark = commodityremark == null ? null : commodityremark.trim();
    }

    public String getCommoditydetail() {
        return commoditydetail;
    }

    public void setCommoditydetail(String commoditydetail) {
        this.commoditydetail = commoditydetail == null ? null : commoditydetail.trim();
    }
}