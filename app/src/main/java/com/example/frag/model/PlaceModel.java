package com.example.frag.model;

public class PlaceModel {
    private String title;
    private int pic;
    private double fee;

    public PlaceModel(String title, int pic) {
        this.title = title;
        this.pic = pic;
    }
    public PlaceModel(String title, int pic, double fee) {
        this.title = title;
        this.pic = pic;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
