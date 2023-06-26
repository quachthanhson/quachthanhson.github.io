package QuanLyBanHang.entity;

import javax.imageio.stream.ImageOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Employee extends Human{
    private static int AUTO_ID = 1000;
    private int id;
    private LocalDate date;

    public Employee() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        super.inputInfo();

        System.out.println("Nhập ngày ký hợp đồng");
        int day;
        //check day
        do{
            day = new Scanner(System.in).nextInt();
            if(day>=1 && day <=31){
                break;
            }
            System.out.println("Mời nhập lại ngày kí hợp đồng: ");
        }while (true);

        System.out.println("Nhập tháng ký hợp đồng");
        int month;

        //check month
        do{
            month = new Scanner(System.in).nextInt();
            if(month >=1 && month <=12){
                break;
            }
            System.out.println("Mời nhập lại tháng ký hợp đồng: ");
        }while (true);

        System.out.println("Nhập năm ký hợp đồng");
        int year = new Scanner(System.in).nextInt();

        this.setDate(LocalDate.of(year, month, day));
    }
}
