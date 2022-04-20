package FinalExamModule2.services;

import FinalExamModule2.models.DienThoaiXachTay;
import FinalExamModule2.util.NotFoundMedicalRecordException;
import FinalExamModule2.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

import static FinalExamModule2.controllers.Controller.displayMenu;

public class DienThoaiXachTayImpl implements DienThoaiXachTayService{
    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void delete() throws NotFoundMedicalRecordException {

    }
//        Scanner sc = new Scanner(System.in);
//
//        public void delete() throws NotFoundMedicalRecordException {
//
//            List<DienThoaiXachTay> dienThoaiXachTayList = ReadAndWrite.readDienThoai();
//
//            if (dienThoaiXachTayList.isEmpty()) {
//                System.out.println("Danh Sach Dien Thoai Rong ->Vui Long Nhap Dien Thoai! ");
//                System.out.println("---------------------------");
//            } else {
//                display();
//                String id;
//                boolean check = true;
//                do {
//                    do {
//                        System.out.println("Lua Chon Dien Thoai De Xoa: ");
//                        id = sc.nextLine();
//                    } while (id.equals(""));
//
//                    for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
//                        if (id.equals(dienThoaiXachTayList.get(i).getID())) {
//                            int choiceChildFunction = -1;
//                            System.out.println("1.\tYes");
//                            System.out.println("2.\tNo");
//                            System.out.println("---------------------------");
//                            System.out.println("Select choice :");
//                            try {
//                                choiceChildFunction = Integer.parseInt(sc.nextLine());
//                            } catch (Exception e) {
//                                System.out.println("Nhập sai vui lòng nhập lại số: ");
//                                continue;
//                            }
//                            if (choiceChildFunction == 1) {
//                                dienThoaiXachTayList.remove(i);
//                                ReadAndWrite.writeDienThoai(dienThoaiXachTayList, false);
//                                display();
//                                check=false;
//                            }
//                            if (choiceChildFunction == 2) {
//                                displayMenu();
//                            }
//                        }
//                        else
//                        {
//                            if(i==dienThoaiXachTayList.size()-1){
//                                throw new NotFoundMedicalRecordException();
//                            }
//                        }
//                    }
//
//                } while (check) ;
//            }
//        }
//
//
//        public void display() {
//            List<DienThoaiXachTay> dienThoaiXachTayList = ReadAndWrite.readDienThoai();
//            if (dienThoaiXachTayList.isEmpty()) {
//                System.out.println("Danh sach rong -> Vui long nhap vao danh sach! ");
//            }
//            else {
//                for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
//                    System.out.println((i + 1) + "." + dienThoaiXachTayList.get(i));
//                }
//            }
//        }
//
//        @Override
//        public void addNew() {
//            List<DienThoaiChinhHang> dienThoaiXachTayList = ReadAndWrite.readDienThoai();
//            int id;
//            if (dienThoaiXachTayList.isEmpty()) {
//                id = 1;
//            } else {
//                id = Integer.parseInt(dienThoaiXachTayList.get(dienThoaiXachTayList.size() - 1).getID()) + 1;
//            }
//
//            System.out.println("ID: " + id);
//
//
//            System.out.println("Ten dien thoai: ");
//            String tenDienThoai = sc.nextLine();
//
//
//            String giaBan;
//            do {
//                System.out.println("Gia ban: ");
//                giaBan= sc.nextLine();
//            } while (giaBan.equals(""));
//
//
//            String soLuong ;
//            do {
//                System.out.println("So luong: ");
//                soLuong = sc.nextLine();
//            } while (soLuong.equals(""));
//
//            String nhaSanXuat;
//            do {
//                System.out.println("Nha san xuat: ");
//                nhaSanXuat = sc.nextLine();
//            } while (nhaSanXuat.equals(""));
//
//
//            String quocGiaXachTay = sc.nextLine();
//
//
//            String trangThai = sc.nextLine();
//
//
//
//            DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(Integer.toString(id),tenDienThoai,giaBan,soLuong,nhaSanXuat, quocGiaXachTay,trangThai);
//            dienThoaiXachTayList.add(dienThoaiXachTay);
//
//            if (dienThoaiXachTayList.size() == 1) {
//                ReadAndWrite.writeDienThoai(dienThoaiXachTayList, true);
//            }
//            else
//            if (dienThoaiXachTayList.size() > 1) {
//                for (int i = 0; i < dienThoaiXachTayList.size()-1; ) {
//                    dienThoaiXachTayList.remove(i);
//                }
//                ReadAndWrite.writeDienThoai(dienThoaiXachTayList, true);
//            }
//
//
//        }


}
