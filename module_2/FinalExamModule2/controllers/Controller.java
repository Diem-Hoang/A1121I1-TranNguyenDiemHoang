package FinalExamModule2.controllers;

import FinalExamModule2.services.DienThoaiChinhHangImpl;
import FinalExamModule2.services.DienThoaiXachTayImpl;
import FinalExamModule2.util.NotFoundMedicalRecordException;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws NotFoundMedicalRecordException {

        displayMenu();
    }

    public static void displayMenu() throws NotFoundMedicalRecordException {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1.\tThêm mới");
            System.out.println("2.\tXóa");
            System.out.println("3.\tXem danh sách điện thoại");
            System.out.println("4.\tTìm kiếm");
            System.out.println("5.\tThoát");
            System.out.println("---------------------------");
            System.out.println("Chọn chức năng:");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai vui lòng nhập lại: ");
                continue;
            }
             DienThoaiChinhHangImpl dienThoaiChinhHang = new DienThoaiChinhHangImpl();
            switch (choice) {
                case 1:
                    dienThoaiChinhHang.addNew();
                    break;
                case 2:
                    while (true) {
                        try {
                           dienThoaiChinhHang.delete();
                        }
                        catch (NotFoundMedicalRecordException e) {
                            System.out.println("Error: Khong Ton Tai Dien Thoai  -> Try again! ");
                            continue;
                        }
                        break;
                    }
                    break;
                case 3:
                    dienThoaiChinhHang.display();
                    ;
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    choice = -1;
            }
        }
    }

    public static void addNewDienThoai() throws NotFoundMedicalRecordException {
        Scanner sc = new Scanner(System.in);
        DienThoaiChinhHangImpl dienThoaiChinhHang = new DienThoaiChinhHangImpl();
        DienThoaiXachTayImpl dienThoaiXachTay = new DienThoaiXachTayImpl();
        int choiceChildFunction = -1;
        while (choiceChildFunction != 0) {
            System.out.println("1.\tThem dien thoai chinh hang");
            System.out.println("2.\tThem dien thoai xach tay");
            System.out.println("3.\tReturn main menu");
            System.out.println("---------------------------");
            System.out.println("Select choice :");
            try {
                choiceChildFunction = Integer.parseInt(sc.nextLine());
            }catch (Exception e)
            {
                System.out.println("Nhập sai vui lòng nhập lại số: ");
                continue;
            }
            switch (choiceChildFunction) {
                case 1: dienThoaiChinhHang.addNew();
                    break;
                case 2: //dienThoaiXachTay.addNew();
                    break;
                case 3: displayMenu();
                    break;
                default:
                    System.out.println("No choice!");
                    choiceChildFunction = -1;
            }
        }
    }
}


