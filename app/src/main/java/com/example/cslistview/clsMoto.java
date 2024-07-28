package com.example.cslistview;

public class clsMoto {
    private String NAME;
    private String DETAIL;
    private int imgHinh;

    public clsMoto(String NAME, String DETAIL, int imgHinh) {
        this.NAME = NAME;
        this.DETAIL = DETAIL;
        this.imgHinh = imgHinh;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDETAIL() {
        return DETAIL;
    }

    public void setDETAIL(String DETAIL) {
        this.DETAIL = DETAIL;
    }

    public int getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(int imgHinh) {
        this.imgHinh = imgHinh;
    }
}
