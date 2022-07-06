package com.codegym.model;

public class MedicalDeclaration {
    private int stt;
    private String ten;
    private String ngaysinh;
    private String gioitinh;
    private String quoctich;
    private String cmnd;
    private String thongtindilai;
    private String sohieu;
    private int soghe;
    private String thanhphodaden;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(int stt, String ten, String ngaysinh, String gioitinh, String quoctich, String cmnd, String thongtindilai, String sohieu, int soghe, String thanhphodaden) {
        this.stt = stt;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quoctich = quoctich;
        this.cmnd = cmnd;
        this.thongtindilai = thongtindilai;
        this.sohieu = sohieu;
        this.soghe = soghe;
        this.thanhphodaden = thanhphodaden;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getThongtindilai() {
        return thongtindilai;
    }

    public void setThongtindilai(String thongtindilai) {
        this.thongtindilai = thongtindilai;
    }

    public String getSohieu() {
        return sohieu;
    }

    public void setSohieu(String sohieu) {
        this.sohieu = sohieu;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public String getThanhphodaden() {
        return thanhphodaden;
    }

    public void setThanhphodaden(String thanhphodaden) {
        this.thanhphodaden = thanhphodaden;
    }
}
