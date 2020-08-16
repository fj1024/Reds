package com.redtravel.bean;

import java.util.Date;

public class Order {
    private Integer orderid;

    private String ordercommodity;

    private Date orderbuildtime;

    private Integer orderprice;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdercommodity() {
        return ordercommodity;
    }

    public void setOrdercommodity(String ordercommodity) {
        this.ordercommodity = ordercommodity == null ? null : ordercommodity.trim();
    }

    public Date getOrderbuildtime() {
        return orderbuildtime;
    }

    public void setOrderbuildtime(Date orderbuildtime) {
        this.orderbuildtime = orderbuildtime;
    }

    public Integer getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Integer orderprice) {
        this.orderprice = orderprice;
    }
}