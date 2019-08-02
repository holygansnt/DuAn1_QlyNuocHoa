package com.example.duan1_qlynuochoa.model;

public class Bill {
    String maBill;
    String ngayMua;

    public Bill(String maBill, String ngayMua) {
        this.maBill = maBill;
        this.ngayMua = ngayMua;
    }

    public Bill() {

    }

    public String getMaBill() {
        return maBill;
    }

    public void setMaBill(String maBill) {
        this.maBill = maBill;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }
}
