package Thi_Module2.models;

public abstract class BenhAn {
    private String stt;
    private String maBenhAn;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lydo;

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    public BenhAn(){

    }
    public BenhAn(String stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydo){
        this.stt = stt;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lydo = lydo;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "stt=" + stt +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lydo='" + lydo + '\'' +
                '}';
    }
}
