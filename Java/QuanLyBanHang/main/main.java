package QuanLyBanHang.main;

import QuanLyBanHang.entity.Employee;
import QuanLyBanHang.entity.Product;

import java.util.Scanner;

public class main {

    private static Employee[] employees = new Employee[100];
    private static Product[] products = new Product[100];


    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        while (true){
            showMenuContent();
            int choice = funtionChoice();
            switch (choice){
                case 1:
                    inputNewProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    inputNewEmployee();
                    break;
                case 4:
                    showEmployee();
                    break;
                case 5:
                    inputNewEmployeeWork();
                    break;
                case 6:
                    break;
                case 7:
                    ShowSortContent();
                    break;
                case 8:
                    break;
                case 9:
                    break;

            }
        }
    }

    private static void inputNewEmployeeWork() {
        System.out.println("Nhập số nhân viên bạn muốn họ làm việc: ");
    }

    private static void ShowSortContent() {
        System.out.println("1. Sắp xếp danh sách bảng theo tên nhân viên ");
        System.out.println("2. Sắp xếp danh sách bảng nhóm mặt hàng ");

    }

    private static void showEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i]!=null){
                System.out.println(employees[i]);
            }
        }
    }

    private static void inputNewEmployee() {
        System.out.println("Bạn thêm mới bao nhiêu nhân viên: ");
        int EmployeeNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < EmployeeNumber; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i+1));
            Employee employee = new Employee();
            employee.inputInfo();
            saveEmployee(employee);
        }
    }

    private static void saveEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }


    private static void showProduct() {
        for (int i = 0; i < products.length; i++) {
            if(products[i]!=null){
                System.out.println(products[i]);
            }
        }
    }

    private static void inputNewProduct() {
        System.out.println("Bạn muốn nhập dữ liệu cho bao nhiêu mặt hàng: ");
        int productNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < productNumber; i++) {
            Product product = new Product();
            product.inputInfo();
            saveProduct(product);

        }
    }

    private static void saveProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if(products[i] == null){
                products[i] =product;
                break;
            }

        }
    }

    private static int funtionChoice() {
        int choice;
        do{
            choice = new Scanner(System.in).nextInt();
            if(choice>=1 && choice <=9){
                break;
            }
            System.out.println("Mời nhập lại: ");
        }while (true);
        return choice;
    }

    private static void showMenuContent(){
        System.out.println("================= Quản lý bán hàng =================");
        System.out.println("1. Thêm mới mặt hàng :");
        System.out.println("2. In ra danh sách mặt hàng");
        System.out.println("3. Thêm mới nhân viên");
        System.out.println("4. In ra danh sách nhân viên");
        System.out.println("5. Lập bảng kê khai bán hàng cho từng nhân viên");
        System.out.println("6. In bảng kê khai bán hàng cho từng nhân viên");
        System.out.println("7. Sắp xếp danh sách bán hàng");
        System.out.println("8. Lập bảng kê doanh thu cho nhân viên");
        System.out.println("9. Thoát");
        System.out.println("Mời bạn lựa chọn: ");
    }
}
