package Day8_Homework.main;

import Day8_Homework.entity.BanDoc;
import Day8_Homework.entity.Sach;
import Day8_Homework.statics.LoaiChuyenNganh;
import Day8_Homework.statics.LoaiBanDoc;

import java.util.Scanner;

public class main {

    private static BanDoc[] banDocs = new BanDoc[100];

    private static Sach[] sachs = new Sach[100];


    public static void main(String[] args) {
        while (true) {
            System.out.println("======================== PHẦN MỀM QUẢN LÝ MƯỢN SÁCH ========================");

            System.out.println("1. Nhập đầu sách mới");
            System.out.println("2. In danh sách đầu sách đã có");
            System.out.println("3. Nhập bạn đọc mới");
            System.out.println("4. In danh sách bạn đọc đã có");
            System.out.println("5. Lập bảng quản lý mượn sách ");
            System.out.println("6. Sắp xếp danh sách quản lý mượn sách");
            System.out.println("7. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc");
            System.out.println("8. Thoát");
            System.out.println("Mời bạn chọn: ");

            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bạn muốn thêm bao nhiêu đầu sách mới");
                    int bookNumber = new Scanner(System.in).nextInt();
                    for (int i = 0; i < bookNumber; i++) {
                        System.out.println("Nhập thông tin đầu sách thứ" + (i+1));
                        Sach sach = new Sach();
                        System.out.println("Nhập tên sách: ");
                        sach.setTenSach(new Scanner(System.in).nextLine());

                        System.out.println("Nhập tên tác giả cuốn sách: ");
                        sach.setTacGia(new Scanner(System.in).nextLine());
                        System.out.println("Nhập chuyên nghành cuốn sách: ");
                        System.out.println("1. Khoa học tự nhiên");
                        System.out.println("2. Văn học nghệ thuật");
                        System.out.println("3. Điện tử viễn thông");
                        System.out.println("4. Công nghệ thông tin");
                        System.out.println("Mời bạn chọn");
                        int booktypechoice = new Scanner(System.in).nextInt();
                        switch (booktypechoice){
                            case 1:
                                sach.setChuyennganh(LoaiChuyenNganh.Khoa_Hoc_Tu_Nhien);
                                break;
                            case 2:
                                sach.setChuyennganh(LoaiChuyenNganh.Van_Hoc_Nghe_Thuat);
                                break;
                            case 3:
                                sach.setChuyennganh(LoaiChuyenNganh.Dien_Tu_Vien_Thong);
                                break;
                            case 4:
                                sach.setChuyennganh(LoaiChuyenNganh.Cong_Nghe_Thong_Tin);
                                break;
                        }
                        System.out.println("Nhập năm xuất bản cuốn sách");
                        sach.setNamXuatBan(new Scanner(System.in).nextLine());

                        for (int j = 0; j < sachs.length; j++) {
                            if(sachs[i] == null){
                                sachs[i] = sach;
                                break;
                            }
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < sachs.length; i++) {
                        if(sachs[i] != null){
                            System.out.println(sachs[i]);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Bạn muốn thêm bao nhiêu bạn đọc mới: ");
                    int readerNumber = new Scanner(System.in).nextInt();
                    for (int i = 0; i < readerNumber; i++) {
                        System.out.println("Nhập thông tin cho bạn đọc thứ " + (i + 1));
                        BanDoc banDoc = new BanDoc();
                        System.out.println("Nhập tên bạn đọc:");
                        banDoc.setHoTen(new Scanner(System.in).nextLine());
                        System.out.println("Nhập địa chỉ bạn đọc:");
                        banDoc.setDiaChi(new Scanner(System.in).nextLine());
                        System.out.println("Nhập SĐT bạn đọc:");
                        banDoc.setSĐT(new Scanner(System.in).nextLine());
                        System.out.println("Nhập loại bạn đọc:");
                        System.out.println("1. Sinh viên");
                        System.out.println("2. Học viên cao học");
                        System.out.println("3. Giáo viên");
                        System.out.println("Mời bạn chọn");
                        int persontypechoice = new Scanner(System.in).nextInt();

                        switch (persontypechoice) {
                            case 1:
                                banDoc.setPhanloai(LoaiBanDoc.Sinh_Vien);
                                break;
                            case 2:
                                banDoc.setPhanloai(LoaiBanDoc.Hoc_Vien_Cao_Hoc);
                                break;
                            case 3:
                                banDoc.setPhanloai(LoaiBanDoc.Giao_Vien);
                                break;
                        }

                        for (int j = 0; j < banDocs.length; j++) {
                            if (banDocs[i] == null) {
                                banDocs[i] = banDoc;
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < banDocs.length; i++) {
                        if(banDocs[i] != null){
                        System.out.println(banDocs[i]);
                        }
                    }

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
}
