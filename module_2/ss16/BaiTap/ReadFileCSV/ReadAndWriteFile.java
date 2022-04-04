package ss16.BaiTap.ReadFileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    final String SPACE = ",";

    public void writeList(String path, List<Countries> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path));) {

            writer.write("ID" + SPACE + "CODE" + SPACE + "NAME");
            for (Countries nation : list) {
                writer.newLine();
                writer.write(nation.getId() + SPACE + nation.getCode() + SPACE + nation.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readList(String path) {
        List<Countries> listNation = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = null;
            line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] propertyNation = line.split(",");
                int id = Integer.parseInt(propertyNation[0]);
                String code = propertyNation[1];
                String name = propertyNation[2];

                listNation.add(new Countries(id, code, name));
            }

            listNation.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
