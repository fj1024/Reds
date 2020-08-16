package com.redtravel.bean;

public class User {
    private Integer userid;

    private String usertelephone;

    private String userpassword;

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", usertelephone='" + usertelephone + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsertelephone() {
        return usertelephone;
    }

    public void setUsertelephone(String usertelephone) {
        this.usertelephone = usertelephone;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public User(Integer userid, String usertelephone, String userpassword) {
        this.userid = userid;
        this.usertelephone = usertelephone;
        this.userpassword = userpassword;
    }

    public User() {
    }
}