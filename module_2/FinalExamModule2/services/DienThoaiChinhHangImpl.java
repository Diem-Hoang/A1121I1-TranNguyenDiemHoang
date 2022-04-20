package FinalExamModule2.services;

import FinalExamModule2.models.DienThoaiChinhHang;
import FinalExamModule2.util.NotFoundMedicalRecordException;
import FinalExamModule2.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

import static FinalExamModule2.controllers.Controller.displayMenu;

public class DienThoaiChinhHangImpl implements DienThoaiChinhHangService{
    Scanner sc = new Scanner(System.in);
    //private static final String BENH_AN = "BA-[\\d]{3}";



    public void delete() throws NotFoundMedicalRecordException {

        List<DienThoaiChinhHang> dienThoaiChinhHangs = ReadAndWrite.readDienThoai();

        if (dienThoaiChinhHangs.isEmpty()) {
            System.out.println("Danh Sach Dien Thoai Rong ->Vui Long Nhap Dien Thoai! ");
            System.out.println("---------------------------");
        } else {
            display();
            String id;
            boolean check = true;
            do {
                do {
                    System.out.println("Lua Chon Dien Thoai De Xoa: ");
                    id = sc.nextLine();
                } while (id.equals(""));

                for (int i = 0; i < dienThoaiChinhHangs.size(); i++) {
                    if (id.equals(dienThoaiChinhHangs.get(i).getID())) {
                        int choiceChildFunction = -1;
                        System.out.println("1.\tYes");
                        System.out.println("2.\tNo");
                        System.out.println("---------------------------");
                        System.out.println("Select choice :");
                        try {
                            choiceChildFunction = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Nhập sai vui lòng nhập lại số: ");
                            continue;
                        }
                        if (choiceChildFunction == 1) {
                            dienThoaiChinhHangs.remove(i);
                            ReadAndWrite.writeDienThoai(dienThoaiChinhHangs, false);
                            display();
                            check=false;
                        }
                        if (choiceChildFunction == 2) {
                            displayMenu();
                        }
                    }
                    else
                    {
                        if(i==dienThoaiChinhHangs.size()-1){
                            throw new NotFoundMedicalRecordException();
                        }
                    }
                }

            } while (check) ;
        }
    }


    public void display() {
        List<DienThoaiChinhHang> dienThoaiChinhHangs = ReadAndWrite.readDienThoai();
        if (dienThoaiChinhHangs.isEmpty()) {
            System.out.println("Danh sach rong -> Vui long nhap vao danh sach! ");
        }
        else {
            for (int i = 0; i < dienThoaiChinhHangs.size(); i++) {
                System.out.println((i + 1) + "." + dienThoaiChinhHangs.get(i));
            }
        }
    }

    @Override
    public void addNew() {
        List<DienThoaiChinhHang> dienThoaiChinhHangList = ReadAndWrite.readDienThoai();
        int id;
        if (dienThoaiChinhHangList.isEmpty()) {
            id = 1;
        } else {
            id = Integer.parseInt(dienThoaiChinhHangList.get(dienThoaiChinhHangList.size() - 1).getID()) + 1;
        }

        System.out.println("ID: " + id);


        System.out.println("Ten dien thoai: ");
        String tenDienThoai = sc.nextLine();
        System.out.println("Gia ban: ");
        String giaBan = sc.nextLine();
        System.out.println("So luong: ");
        String soLuong = sc.nextLine();
        System.out.println("Nha san xuat: ");
        String nhaSanXuat = sc.nextLine();
        System.out.println("Thoi gian bao hanh: ");
        String thoiGianBaoHanh = sc.nextLine();
        System.out.println("Pham vi bao hanh: ");
        String phamViBaoHanh = sc.nextLine();


        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(Integer.toString(id),tenDienThoai,giaBan,soLuong,nhaSanXuat, thoiGianBaoHanh,phamViBaoHanh);
        dienThoaiChinhHangList.add(dienThoaiChinhHang);

        if (dienThoaiChinhHangList.size() == 1) {
            ReadAndWrite.writeDienThoai(dienThoaiChinhHangList, true);
        }
        else
        if (dienThoaiChinhHangList.size() > 1) {
            for (int i = 0; i < dienThoaiChinhHangList.size()-1; ) {
                dienThoaiChinhHangList.remove(i);
            }
            ReadAndWrite.writeDienThoai(dienThoaiChinhHangList, true);
        }


    }

//    public String inputmaBenhAn(){
//
//        return Regex.regexStr(sc.nextLine(),BENH_AN,"Import bad format -> Please enter again: ");
//    }


}
