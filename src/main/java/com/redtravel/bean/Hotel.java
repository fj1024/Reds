package com.redtravel.bean;

public class Hotel {
    private Integer hotelid;

    private String hotelname;

    private String hotellocation;

    private String hotelcontact;

    private String hoteldetail;

    private String hotelpicture;

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public String getHotellocation() {
        return hotellocation;
    }

    public void setHotellocation(String hotellocation) {
        this.hotellocation = hotellocation == null ? null : hotellocation.trim();
    }

    public String getHotelcontact() {
        return hotelcontact;
    }

    public void setHotelcontact(String hotelcontact) {
        this.hotelcontact = hotelcontact == null ? null : hotelcontact.trim();
    }

    public String getHoteldetail() {
        return hoteldetail;
    }

    public void setHoteldetail(String hoteldetail) {
        this.hoteldetail = hoteldetail == null ? null : hoteldetail.trim();
    }

    public String getHotelpicture() {
        return hotelpicture;
    }

    public void setHotelpicture(String hotelpicture) {
        this.hotelpicture = hotelpicture == null ? null : hotelpicture.trim();
    }
}