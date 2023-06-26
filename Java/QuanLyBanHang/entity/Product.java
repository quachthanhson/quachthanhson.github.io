package QuanLyBanHang.entity;

import QuanLyBanHang.statics.ProductGroup;

import java.util.Scanner;

public class Product implements inputInfo{

    private static int AUTO_ID = 1000;

    private int id;
    private String name;
    private ProductGroup group;
    private double price;
    private int numberProduct;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductGroup getGroup() {
        return group;
    }

    public void setGroup(ProductGroup group) {
        this.group = group;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", price='" + price + '\'' +
                ", numberProduct='" + numberProduct + '\'' +
                '}';
    }


    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.println("Nhập tên sản phẩm ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập nhóm mặt hàng:");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");

        int ProductChoice;
        do{
             ProductChoice = new Scanner(System.in).nextInt();
                if(ProductChoice>=1 && ProductChoice <=4){
                    break;
                }
                System.out.println("Mời nhập lại: ");
            }while (true);
        switch (ProductChoice){
            case 1:
                this.setGroup(ProductGroup.Dien_Tu);
                break;
            case 2:
                this.setGroup(ProductGroup.Dien_Lanh);
                break;
            case 3:
                this.setGroup(ProductGroup.May_Tinh);
                break;
            case 4:
                this.setGroup(ProductGroup.Thiet_Bi_Van_Phong);
                break;
        }
        System.out.println("Nhập giá bán sản phẩm ");
        this.price = new Scanner(System.in).nextInt();
        System.out.println("Nhập số lượng sản phẩm ");
        this.numberProduct = new Scanner(System.in).nextInt();
    }


}
