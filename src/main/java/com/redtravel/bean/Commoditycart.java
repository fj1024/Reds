package com.redtravel.bean;

import java.math.BigDecimal;

public class Commoditycart {
    private Integer commoditycartid;

    private String commoditycartname;

    private BigDecimal commoditycartprice;

    public Integer getCommoditycartid() {
        return commoditycartid;
    }

    public void setCommoditycartid(Integer commoditycartid) {
        this.commoditycartid = commoditycartid;
    }

    public String getCommoditycartname() {
        return commoditycartname;
    }

    public void setCommoditycartname(String commoditycartname) {
        this.commoditycartname = commoditycartname == null ? null : commoditycartname.trim();
    }

    public BigDecimal getCommoditycartprice() {
        return commoditycartprice;
    }

    public void setCommoditycartprice(BigDecimal commoditycartprice) {
        this.commoditycartprice = commoditycartprice;
    }
}