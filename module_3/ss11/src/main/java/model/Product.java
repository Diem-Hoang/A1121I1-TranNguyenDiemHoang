package model;

public class Product {
//    Các thuộc tính của sản phẩm bao gồm: id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    private String id;
    private String nameProduct;
    private String price;
    private String description;
    private String manufacturer;

    public Product() {
    }

    public Product(String id, String nameProduct, String price, String description, String manufacturer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
