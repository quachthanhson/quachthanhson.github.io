package QuanLyNhuanButChoPhongVien.main;

import QuanLyNhuanButChoPhongVien.entity.Interview;
import QuanLyNhuanButChoPhongVien.statics.InterviewLevel;
import QuanLyTraLuongThinhGiang.entity.Teacher;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    private static Interview[] interviews = new Interview[100];


    public static void main(String[] args) {

    }

    private static void Menu() {
        while (true){
            MenuContent();
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập số phóng viên bạn muốn thêm: ");
                    int numberInterview = new Scanner(System.in).nextInt();
                    for (int i = 0; i < numberInterview; i++) {
                        System.out.println("Nhập thông tin cho phogns viên thứ"+ (i+1));
                        Interview interview = new Interview();
                        System.out.println("Nhập tên: ");
                        interview.setName(new Scanner(System.in).nextLine());
                        System.out.println("Nhập địa chỉ: ");
                        interview.setAddress(new Scanner(System.in).nextLine());
                        System.out.println("Nhập SĐT: ");
                        interview.setPhone(new Scanner(System.in).nextLine());
                        System.out.println("Nhập loại phóng viên");
                        System.out.println("1. Chuyên nghiệp");
                        System.out.println("2. Nghiệp dư");
                        System.out.println("3. Cộng tác viên");
                        int typeChoice = new Scanner(System.in).nextInt();
                        switch (typeChoice){
                            case 1:
                                interview.setTypeInterview(InterviewLevel.chuyen_nghiep);
                                break;
                            case 2:
                                interview.setTypeInterview(InterviewLevel.nghiep_du);
                                break;
                            case 3:
                                interview.setTypeInterview(InterviewLevel.cong_tac_vien);
                                break;
                        }
                        for (int j = 0; j < interviews.length; j++) {
                            if (interviews[j] == null) {
                                if (interviews[j] == null) {
                                    interviews[j] = interview;
                                    break;
                                }
                            }
                        }
                        break;
                        case 2:
                            showInterview();

                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return;
                    }


            }
    }

}



    private static void MenuContent() {
        System.out.println("============= QUẢN LÝ NHUẬN BÚT CHO PHÓNG VIÊN =============");
        System.out.println("1. Thêm phóng viên");
        System.out.println("2. In danh sách phóng viên đã có");
        System.out.println("3. Thêm kiểu bài viết");
        System.out.println("4. In danh sách kiểu bài viết đã có");
        System.out.println("5. Lập bảng tính công cho phóng viên");
        System.out.println("6. Sắp xếp danh sách bảng tính công theo họ và tên phóng viên");
        System.out.println("6. Sắp xếp danh sách bảng tính công giảm dần theo số lượng bài viết");
        System.out.println("7. Lập bảng kê thu nhập của mỗi phóng viên");
        System.out.println("8. Thoát");
    }


}
