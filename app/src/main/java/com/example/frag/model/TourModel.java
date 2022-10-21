package com.example.frag.model;

public class TourModel {
    private String title;
    private int pic;
    private int fee;

    public TourModel(String title, int pic, int fee) {
        this.title = title;
        this.pic = pic;
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

    public double getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
