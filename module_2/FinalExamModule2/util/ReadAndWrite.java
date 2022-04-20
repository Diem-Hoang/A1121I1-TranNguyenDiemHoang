package FinalExamModule2.util;

import FinalExamModule2.models.DienThoaiChinhHang;
import FinalExamModule2.models.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;




public class ReadAndWrite {
    final static String DienThoai = "D:\\CODE\\A1121I1_TranNguyenDiemHoang\\module_2\\FinalExamModule2\\data\\medical_record.csv";

    private static void writeListToCSV(List<String> list, String path, boolean append) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : list) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    private static List<String> readList(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return list;
    }

    public static void writeDienThoai(List<DienThoaiChinhHang> dienThoaiChinhHangList, boolean append){
        List<String> strings = new ArrayList<>();
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
            strings.add(dienThoaiChinhHang.getInfoDienThoai());
        }
        writeListToCSV(strings, DienThoai, append);
    }

    public static List<DienThoaiChinhHang> readDienThoai(){
        List<String> list = readList(DienThoai);
        List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        String[] array = null;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(array[0], array[1],array[2],array[3],array[4],array[5],array[6]);
            dienThoaiChinhHangList.add(dienThoaiChinhHang);
        }
        return dienThoaiChinhHangList;
    }


    public static void writeDienThoaiXachTay(List<DienThoaiXachTay> dienThoaiXachTayList, boolean append){
        List<String> strings = new ArrayList<>();
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
            strings.add(dienThoaiXachTay.getInfoDienThoai());
        }
        writeListToCSV(strings, DienThoai, append);
    }

    public static List<DienThoaiXachTay> readDienThoaiXachTay(){
        List<String> list = readList(DienThoai);
        List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
        String[] array = null;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(array[0],array[1],array[2],array[3],array[4],array[5],array[6]);
            dienThoaiXachTayList.add(dienThoaiXachTay);
        }
        return dienThoaiXachTayList;
    }
}