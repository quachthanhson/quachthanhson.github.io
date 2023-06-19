package Day8_Homework.entity;

import java.util.Scanner;

public class Nguoi implements InputInfo{
    protected String HoTen;
    protected String DiaChi;
    protected String SĐT;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "HoTen='" + HoTen + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", SĐT='" + SĐT + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        System.out.println("Nhập họ tên:");
        this.setHoTen(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ:");
        this.setDiaChi(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại:");
        this.setSĐT(new Scanner(System.in).nextLine());
    }
}
