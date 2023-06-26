package QuanLyTraLuongThinhGiang.Main;

import QuanLyTraLuongThinhGiang.entity.Subject;
import QuanLyTraLuongThinhGiang.entity.Teacher;

import java.util.Scanner;



public class Main {
    private static Teacher[] teachers = new Teacher[100];
    private static Subject[] subjects = new Subject[100];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true){
            showMenuContent();
            int choice = fuctionChoice();
            switch (choice){
                case 1:
                    inputNewTeacher();
                    break;
                case 2:
                    showTeacher();
                    break;
                case 3:
                    inputNewSubject();
                    break;
                case 4:
                    showSubject();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;

            }
        }
    }

    private static void showSubject() {
        for (int i = 0; i < subjects.length; i++) {
            if(subjects[i]!=null){
                System.out.println(subjects[i]);
            }
        }
    }

    private static void inputNewSubject() {
        System.out.println("Bạn muốn nhập dữ liệu cho bao nhiêu môn học");
        int subjectNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < subjectNumber; i++) {
            Subject subject = new Subject();
            subject.inputInfo();
            saveSubject(subject);
        }
    }

    private static void saveSubject(Subject subject) {
        for (int i = 0; i < subjects.length; i++) {
            if(subjects[i] == null){
                subjects[i] =subject;
                break;
            }
        }
    }

    private static int fuctionChoice() {
        int choice;
        do{
            choice = new Scanner(System.in).nextInt();
            if(choice>=1 && choice<=9){
                break;
            }
            System.out.println("Nhập sai, mời nhập lại:");
        }while (true);
        return choice;
    }

    private static void showMenuContent() {

        System.out.println("===================PHẦN MEEMF QUẢN LÝ TẢ LƯƠNG THÌNH GIẢNG====================");
        System.out.println("1.Thêm mới giảng viên");
        System.out.println("2. In danh sách giảng viên");
        System.out.println("3. Thêm mới môn học");
        System.out.println("4. In danh sách môn học");
        System.out.println("5. Lập bảng kê khai giảng dạy.");
        System.out.println("6. In bảng kê khai giảng dạy.");
        System.out.println("7. Sắp xếp bảng kê khai giảng dạy. ");
        System.out.println("8. Tính lương giảng viên. ");
        System.out.println("9. Thoát. ");
        System.out.println("Chọn đê:");
    }

    private static void inputNewTeacher() {
        System.out.println("Bạn muốn thêm mới bao nhiêu giảng viên: ");
        int teacherNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < teacherNumber; i++) {
            System.out.println("Nhập thông tin cho giảng viên thứ " + (i+1));
            Teacher teacher = new Teacher();
            teacher.inputInfo();
            saveTeacher(teacher);
        }
    }

    private static void saveTeacher(Teacher teacher) {
        for (int j = 0; j <teachers.length ; j++) {
            if(teachers[j] == null){
                teachers[j] = teacher;
                break;
            }
        }
    }

    public static void showTeacher(){
        for (int i = 0; i < teachers.length; i++) {
            if(teachers[i]!=null){
                System.out.println(teachers[i]);
            }
        }
    }
}

