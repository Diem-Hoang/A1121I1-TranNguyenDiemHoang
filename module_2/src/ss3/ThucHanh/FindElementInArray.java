package ss3.ThucHanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] names = {"Hoang", "Linh", "Huy", "Son", "Ngoc", "Mai", "Vu", "Quang", "Anh", "Huyen"};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên tìm kiếm: ");
        String input_name = input.nextLine();

        boolean check = false;
        for(int i=0; i<names.length; i++){
            if(names[i].equals(input_name)){
                System.out.println("Tên " + input_name + " trong danh sách ở vị trí thứ: " + i);
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Tên " + input_name + " không có tên trong danh sách");
        }

    }
}
