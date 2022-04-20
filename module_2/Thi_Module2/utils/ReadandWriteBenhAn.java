package Thi_Module2.utils;

import java.io.*;

public class ReadandWriteBenhAn {
    private static String path = "D:\\CODE\\A1121I1_TranNguyenDiemHoang\\module_2\\Thi_Module2\\data\\medical_records.csv";
    public static void writeListBenhAn( Object collection)  {

        File file = new File(path);
        if (!file.exists())
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(collection);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readListBenhAn(){

        File file = new File(path);
        if (!file.exists())
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        Object object = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))  {
            return ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  null;
    }

}
