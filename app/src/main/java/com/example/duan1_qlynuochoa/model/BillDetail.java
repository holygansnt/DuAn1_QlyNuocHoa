package com.example.duan1_qlynuochoa.model;

public class BillDetail {
    String maBillDetail;
    String maProduct;
    String soLuong;

    public BillDetail(String maBillDetial, String maProduct, String soLuong) {
        this.maBillDetail = maBillDetial;
        this.maProduct = maProduct;
        this.soLuong = soLuong;
    }

    public BillDetail() {

    }

    public String getMaBillDetial() {
        return maBillDetail;
    }

    public void setMaBillDetial(String maBillDetial) {
        this.maBillDetail = maBillDetial;
    }

    public String getMaProduct() {
        return maProduct;
    }

    public void setMaProduct(String maProduct) {
        this.maProduct = maProduct;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}
