package Day8_Homework.main;

import Day8_Homework.entity.BanDoc;
import Day8_Homework.entity.Sach;
import Day8_Homework.statics.LoaiBanDoc;
import Day_9.polymorphism.Person;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    private static Sach[] saches = new Sach[100];
    private static BanDoc[] banDocs = new BanDoc[100];


    public static void main(String[] args) {
      Menu();
    }
    public static void HienMenu(){
        System.out.println("=========== Danh sách quản lý mượn ===========");
        System.out.println("1.Thêm đầu sách mới");
        System.out.println("2.In danh sách các đầu sách đã có");
        System.out.println("3.Thêm bạn đọc mới");
        System.out.println("4. In danh sách bạn đọc ã có");
        System.out.println("5. Lập bảng quản lý sách cho từng bạn đọc");
        System.out.println("6. Sắp xếp danh sách ");
        System.out.println("7. Tìm kiếm và hiển thị danh sách mượn theo tên bạn đọc");
        System.out.println("8. Thoát");
        System.out.println("Mời bạn lựa chọn");
    }

    public static void Menu(){
        while (true){
            HienMenu();
            int choice = functionChoice();
            switch (choice){
                case 1:
                    NhapDauSachMoi();
                    break;
                case 2:
                    break;
                case 3:
                    NhapBanDocMoi();
                    break;
                case 4:
                    InDanhSachBanDoc();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;


            }
        }
    }

    private static void NhapDauSachMoi() {
        System.out.println("Bạn muốn thêm bao nhiên sách mới");
        int PersonNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < PersonNumber; i++) {
            System.out.println("Nhập thông tin cho sách mới");
            Sach sach  = new Sach();
            Sach.inputInfo();
            LuuSach(sach);
        }
    }

    private static int functionChoice() {
        int choice;
        do{
            choice = new Scanner(System.in).nextInt();
            if(choice>=1 && choice<=8){
                break;
            }
            System.out.println("Nhập sai, mời nhập lại: ");
        }
        while (true);
        return choice;
    }


    public static void NhapBanDocMoi(){
        System.out.println("Bạn muốn thêm bao nhiêu bạn đọc mới");
        int PersonNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < PersonNumber; i++) {
           System.out.println("Nhập thông tin cho bạn đọc mới");
            BanDoc banDoc = new BanDoc();
            banDoc.inputInfo();
            LuuBanDoc(banDoc);
        }
    }

    private static void LuuBanDoc(BanDoc banDoc) {
        for (int j = 0; j < banDocs.length; j++) {
            if(banDocs[j] ==null){
                banDocs[j] = banDoc;
                break;
            }
        }
    }

    public static void InDanhSachBanDoc(){
        for (int i = 0; i < banDocs.length; i++) {
            if(banDocs[i] != null){
                System.out.println(banDocs[i]);
            }
        }
    }

    private static void LuuSach(Sach sach) {
        for (int j = 0; j < saches.length; j++) {
            if(saches[j] ==null){
                saches[j] = sach;
                break;
            }
        }
    }
}
