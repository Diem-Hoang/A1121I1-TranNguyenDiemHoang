//package Thi_Module2.controllers;
//
//import Thi_Module2.services.BenhAnThuongImpl;
//import Thi_Module2.services.BenhAnVIPImpl;
//
//import java.util.Scanner;
//
//public class Controller {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        displayMainMenu();
//    }
//    public static void displayMainMenu(){
//        int choose=0;
//        do{
//            System.out.println("_____CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN_____");
//            System.out.println("Chọn chức năng theo số để tiếp tục:");
//            System.out.println("1.\tThêm mới");
//            System.out.println("2.\tXóa");
//            System.out.println("3.\tXem danh sách các bệnh án");
//            System.out.println("4.\tThoát");
//            System.out.print("Chọn chức năng: ");
//            switch (sc.nextInt()){
//                case 1:
//                    themBenhAn();
//                    break;
//                case 2:
//                    xoaBenhAn();
//                    break;
//                case 3:
//                    xemBenhAn();
//                    break;
//                case 4:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("\nLỗi! Mời nhập lại!");
//            }
//        }while(choose<1 || choose>4);
//
//    }
//
//    private static void xemBenhAn() {
//        int choose=0;
//        BenhAnThuongImpl benhAnThuong = new BenhAnThuongImpl();
//        BenhAnVIPImpl benhAnVIP = new BenhAnVIPImpl();
//        do{
//            System.out.println();
//            System.out.println("_____XEM DANH SÁCH LOẠI BỆNH ÁN_____");
//            System.out.println("1.\tXem bệnh án thường");
//            System.out.println("2.\tXem bệnh án VIP");
//            System.out.println("3.\tTrở về menu chính");
//            System.out.print("Chọn: ");
//            switch (sc.nextInt()){
//                case 1:
//                    benhAnThuong.xem();
//                    break;
//                case 2:
//                    benhAnVIP.xem();
//                    break;
//                case 3:
//                    displayMainMenu();
//                    break;
//                default:
//                    System.out.println("\nLỗi! Mời nhập lại!");
//            }
//        }while(choose<1 || choose>3);
//    }
//
//    private static void xoaBenhAn() {
//        int choose=0;
//        BenhAnThuongImpl benhAnThuong = new BenhAnThuongImpl();
//        BenhAnVIPImpl benhAnVIP = new BenhAnVIPImpl();
//        do{
//            System.out.println();
//            System.out.println("_____XÓA LOẠI BỆNH ÁN_____");
//            System.out.println("1.\tXóa bệnh án thường");
//            System.out.println("2.\tXóa bệnh án VIP");
//            System.out.println("3.\tTrở về menu chính");
//            System.out.print("Chọn: ");
//            switch (sc.nextInt()){
//                case 1:
//                    benhAnThuong.xoa();
//                    break;
//                case 2:
//                    benhAnVIP.xoa();
//                    break;
//                case 3:
//                    displayMainMenu();
//                    break;
//                default:
//                    System.out.println("\nLỗi! Mời nhập lại!");
//            }
//        }while(choose<1 || choose>3);
//
//    }
//
//    private static void themBenhAn() {
//        int choose=0;
//        BenhAnThuongImpl benhAnThuong = new BenhAnThuongImpl();
//        BenhAnVIPImpl benhAnVIP = new BenhAnVIPImpl();
//        do{
//            System.out.println();
//            System.out.println("_____CHỌN LOẠI BỆNH ÁN_____");
//            System.out.println("1.\tThêm bệnh án thường");
//            System.out.println("2.\tThêm bệnh án VIP");
//            System.out.println("3.\tTrở về menu chính");
//            System.out.print("Chọn: ");
//            switch (sc.nextInt()){
//                case 1:
//                    benhAnThuong.them();
//                    break;
//                case 2:
//                    benhAnVIP.them();
//                    break;
//                case 3:
//                    displayMainMenu();
//                    break;
//                default:
//                    System.out.println("\nLỗi! Mời nhập lại!");
//            }
//        }while(choose<1 || choose>3);
//
//    }
//}
