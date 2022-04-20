package Thi_Module2.models;

public abstract class BenhAnThuong extends BenhAn{
    private String phiNamVien;

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(){}
    public BenhAnThuong(String stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lydo, String phiNamVien){
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lydo);
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" + super.toString() +
                "phiNamVien=" + phiNamVien +
                '}';
    }
    public String getInfoBenhAn(){
        return this.getStt()+ ","+ this.getMaBenhAn()+ "," +this.getTenBenhNhan()+ ","+this.getNgayNhapVien()+ ","+this.getNgayRaVien()+
                ","+this.getLydo()+","+this.getPhiNamVien();
    }

    public abstract void them();

    public abstract void xoa();

    public abstract void xem();
}
