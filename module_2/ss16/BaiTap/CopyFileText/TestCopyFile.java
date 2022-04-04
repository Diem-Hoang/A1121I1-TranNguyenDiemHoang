package ss16.BaiTap.CopyFileText;

import java.io.*;
import java.util.Scanner;

public class TestCopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter path source: ");
        String pathSource = scanner.nextLine();

        System.out.print("Enter path target: ");
        String pathTarget = scanner.nextLine();

        CopyFileText(pathSource, pathTarget);
        System.out.println("Copy file success!");
    }

    public static void CopyFileText (String pathSource, String pathTaget){
        try {
            File sourcefile = new File(pathSource);
            File targetfile = new File(pathTaget);

            if( !sourcefile.exists())
                throw new FileNotFoundException();

            if( targetfile.exists()) {
                System.out.println("Target file already exists!");
            }

            BufferedReader reader = new BufferedReader(new FileReader(pathSource));
            String line = null;
            BufferedWriter writerFile = new BufferedWriter(new FileWriter(pathTaget));
            while ((line = reader.readLine()) != null) {
                writerFile.write(line);
                writerFile.newLine();
            }

            reader.close();
            writerFile.close();
        } catch (Exception e) {
            System.err.println("File not exist or the content has an error!");
            e.getStackTrace();
        }
    }
}