package ss17.BaiTap.ProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public static void addProduct() {
        System.out.println("Enter product code: ");
        int code = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.println("Enter price: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Enter description: ");
        String description = sc.nextLine();

        Product product = new Product(code, name, manufacturer, price, description);
        productList.add(product);
    }

    public static void displayProduct(List<Product> products) {
        for(Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static void writeProductToFile(String path,List<Product> productList) {
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(productList);

            System.out.println("Done");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Product> readProduct(String path) {
        ObjectInputStream ois = null;
        List<Product> products = null;

        try{
            ois = new ObjectInputStream(new FileInputStream(path));
            products = (List<Product>) ois.readObject();


        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        displayProduct(products);
        return products;
    }
    public void searchProduct(String path) {
        //nhập id product để tìm kiếm
        System.out.print("Enter id search of product: ");
        String inInput = sc.nextLine();

        //đọc lại file để lấy lại list product
        List<Product> productsList = readProduct(path);
        for (Product product: productsList) {
            //nếu tìm được sản phẩm thì hiển thị thông tin sản phẩm đó
            if(inInput.equals(product.getCode())) {
                System.out.println("Product tìm được là: "+product);
            }
        }
    }

    public static void main(String[] args) {
        int choose = 2;
        do{
            System.out.println("1. Add product");
            System.out.println("2. Show and Exit");
            System.out.println("2. Search");
            System.out.print("Enter your choose: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    writeProductToFile("MainStudent.txt",productList);
                    readProduct("MainStudent.txt");
                    System.exit(2);
                case 3:

                default:
                    System.out.println("Enter your choose again!");
            }
        }while(choose != 2);

    }
}