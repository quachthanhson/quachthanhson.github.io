package Day2_HomeWork;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 1: Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a\n");
        System.out.println("Nhập a");
        float a = sc.nextFloat();
        System.out.println("Nhập b");
        float b = sc.nextFloat();
        if(a==0 & b==0){
            System.out.println("Phương trình vô số nghiệm");
        } else if (a==0 & b!=0) {
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Nghiệm của phương trình là: " + -b/a);
        }
    }
}
