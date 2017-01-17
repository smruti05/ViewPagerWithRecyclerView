package com.viewpagerexp;

import java.util.List;

public class SampleModel {
    private List<String> paymentList;
    private String id;
    private int drawableId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public List<String> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<String> paymentList) {
        this.paymentList = paymentList;
    }
}
