package com.example.duan1_qlynuochoa.model;

public class LoaiNuocHoa {
    String maLoaiSP;
    String tenLoaiSP;
    String moTa;
    String viTri;

    public LoaiNuocHoa(String maLoaiSP, String tenLoaiSP, String moTa, String viTri) {
        this.maLoaiSP = maLoaiSP;
        this.tenLoaiSP = tenLoaiSP;
        this.moTa = moTa;
        this.viTri = viTri;
    }

    public LoaiNuocHoa() {

    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
}
