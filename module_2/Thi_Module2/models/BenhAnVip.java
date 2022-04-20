package Thi_Module2.models;

public class BenhAnVip extends BenhAn{
    private String loaiVIP;
    private String thoihanVIP;

    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public String getThoihanVIP() {
        return thoihanVIP;
    }

    public void setThoihanVIP(String thoihanVIP) {
        this.thoihanVIP = thoihanVIP;
    }

    public BenhAnVip(){}
    public BenhAnVip(String stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydo, String loaiVIP, String thoihanVIP){
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lydo);
        this.loaiVIP = loaiVIP;
        this.thoihanVIP = thoihanVIP;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" + super.toString() +
                "loaiVIP=" + loaiVIP +
                ", thoihanVIP='" + thoihanVIP + '\'' +
                '}';
    }
    public String getInfoBenhAn(){
        return this.getStt()+ ","+ this.getMaBenhAn()+ "," +this.getTenBenhNhan()+ ","+this.getNgayNhapVien()+ ","+this.getNgayRaVien()+
                ","+this.getLydo()+","+this.getLoaiVIP()+","+this.getThoihanVIP();
    }
}
