package ss16.ThucHanh.Sum_In_TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            //đọc file theo đường dẫn
            File file = new File(filePath);

            //kiểm tra nếu file không tồn tại hoặc không hợp lệ thì ném ra ngoại lệ
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            //đọc từng dòng của file và tiến hành cộng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            //thông báo lỗi khi file không tồn tại hoặc có lỗi
            System.err.println("File không tồn tại hoặc có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
