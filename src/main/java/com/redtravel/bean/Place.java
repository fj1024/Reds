package com.redtravel.bean;

public class Place {
    private Integer placeid;

    private String placename;

    private String placedescription;

    private String placelacation;

    private String placerank;

    private String placeremark;

    private String placepicture;

    private String placecontact;

    private String placeattraction;

    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename == null ? null : placename.trim();
    }

    public String getPlacedescription() {
        return placedescription;
    }

    public void setPlacedescription(String placedescription) {
        this.placedescription = placedescription == null ? null : placedescription.trim();
    }

    public String getPlacelacation() {
        return placelacation;
    }

    public void setPlacelacation(String placelacation) {
        this.placelacation = placelacation == null ? null : placelacation.trim();
    }

    public String getPlacerank() {
        return placerank;
    }

    public void setPlacerank(String placerank) {
        this.placerank = placerank == null ? null : placerank.trim();
    }

    public String getPlaceremark() {
        return placeremark;
    }

    public void setPlaceremark(String placeremark) {
        this.placeremark = placeremark == null ? null : placeremark.trim();
    }

    public String getPlacepicture() {
        return placepicture;
    }

    public void setPlacepicture(String placepicture) {
        this.placepicture = placepicture == null ? null : placepicture.trim();
    }

    public String getPlacecontact() {
        return placecontact;
    }

    public void setPlacecontact(String placecontact) {
        this.placecontact = placecontact == null ? null : placecontact.trim();
    }

    public String getPlaceattraction() {
        return placeattraction;
    }

    public void setPlaceattraction(String placeattraction) {
        this.placeattraction = placeattraction == null ? null : placeattraction.trim();
    }
}