package Day2_HomeWork;

import java.util.Scanner;

public class Bai5b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("2. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E\n");
        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();
        System.out.print("Nhập chuỗi s1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhập chuỗi s2: ");
        String s2 = sc.nextLine();
        String result = s.replace(s1, s2);
        System.out.println("Kết quả: " + result);
    }

}
