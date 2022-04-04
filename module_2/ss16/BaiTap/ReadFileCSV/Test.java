package ss16.BaiTap.ReadFileCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path: ");
        String path = scanner.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Countries> list = new ArrayList<>();
        list.add(new Countries(1,"AU","Australia"));
        list.add(new Countries(2,"CN","China"));
        list.add(new Countries(3,"AU","Australia"));
        list.add(new Countries(5,"JP","Japan"));
        list.add(new Countries(6,"CN","China"));
        list.add(new Countries(7,"JP","Japan"));
        list.add(new Countries(8,"TH","Thailand"));

        readAndWriteFile.writeList(path, list);
        System.out.println("Success!");
        readAndWriteFile.readList(path);

    }
}
