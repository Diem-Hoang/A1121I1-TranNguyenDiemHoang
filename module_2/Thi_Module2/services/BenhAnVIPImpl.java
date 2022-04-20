package Thi_Module2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Thi_Module2.models.BenhAnVip;
import Thi_Module2.utils.ReadandWriteBenhAn;

public class BenhAnVIPImpl implements BenhAnVIPService {
    public static List<BenhAnVip> benhAnList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        System.out.println("-----Thông tin cần thêm mới-----");
        System.out.println("Số thứ tự bệnh án: ");
        String stt = scanner.nextLine();
        System.out.println("Mã bệnh án: ");
        String maBenhAn = scanner.nextLine();
        System.out.println("Tên bệnh nhân: ");
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Ngày nhập viện: ");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Ngày ra viện: ");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Lý do ra viện: ");
        String lydo = scanner.nextLine();
        System.out.println("Loại VIP (I, II, III): ");
        String loaiVIP = scanner.nextLine();
        System.out.println("Thời hạn VIP: ");
        String thoihanVIP = scanner.nextLine();

        BenhAnVip benhAnVip = new BenhAnVip(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lydo, loaiVIP, thoihanVIP);
        benhAnList.add(benhAnVip);
        ReadandWriteBenhAn.writeListBenhAn(benhAnVip);
        //ReadandWriteBenhAn.readListBenhAn(benhAnVip);
        System.out.println("Thêm thành công");
    }

    @Override
    public void xoa() {

    }

    @Override
    public void xem() {
        for (BenhAnVip benhAn :benhAnList){
            System.out.println(benhAn.toString());
        }
    }
}
