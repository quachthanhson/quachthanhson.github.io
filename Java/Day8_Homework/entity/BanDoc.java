package Day8_Homework.entity;

import Day8_Homework.statics.LoaiBanDoc;

import java.util.Scanner;

public class BanDoc extends Nguoi {

    private static  int AUTO_ID = 10000;

    private int MaBanDoc;
    private LoaiBanDoc PhanLoai;

    public BanDoc() {
        this.MaBanDoc =AUTO_ID;
        AUTO_ID++;
    }

    public int getMaBanDoc() {
        return MaBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        MaBanDoc = maBanDoc;
    }

    public LoaiBanDoc getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(LoaiBanDoc phanLoai) {
        PhanLoai = phanLoai;
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "MaBanDoc=" + MaBanDoc +
                ", PhanLoai=" + PhanLoai +
                ", HoTen='" + HoTen + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", SĐT='" + SĐT + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.println("Loại bạn đọc");
        System.out.println("1. Sinh Viên");
        System.out.println("2. Học viên cao học");
        System.out.println("3. Giáo Viên");
        System.out.println("Mời bạn chọn:");
        int typechoice = new Scanner(System.in).nextInt();

        do{
            typechoice = new Scanner(System.in).nextInt();
            if(typechoice>=1 && typechoice<=3){
                break;
            }
            System.out.println("Nhập sai, mời nhập lại: ");
        }
        while (true);
        switch (typechoice){
            case 1:
                this.setPhanLoai(LoaiBanDoc.Sinh_Vien);
                break;
            case 2:
                this.setPhanLoai(LoaiBanDoc.Hoc_Vien_Cao_Hoc);
                break;
            case 3:
                this.setPhanLoai(LoaiBanDoc.Giao_Vien);
                break;
        }
    }
}
