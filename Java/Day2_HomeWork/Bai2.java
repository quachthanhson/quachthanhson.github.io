package Day2_HomeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        float a = sc.nextFloat();
        System.out.println("Nhập b");
        float b = sc.nextFloat();
        System.out.println("Nhập c");
        float c = sc.nextFloat();
        float delta = (float) (Math.pow(b,2) - 4*a*c);
        if(a!=0){
            if(delta<0){
                System.out.println("Phương trình vô nghiệm");
            } else if (delta==0) {
                System.out.println("Nghiệm kép của phương trình là: " + (-b)/2/a);
            }   else{
                System.out.println("Phương trình có 2 nghiệm phân biệt ");
                System.out.println("Nghiệm thứ nhất là: " + (-b + Math.sqrt(delta))/2/a );
                System.out.println("Nghiệm thứ hai là: " + (-b - Math.sqrt(delta))/2/a );
            }
        }else{
            if(b==0 & c==0){
                System.out.println("Phương trình vô số nghiệm");
            } else if (b==0 & c!=0) {
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Nghiệm của phương trình là: " + -c/b);
            }
        }



    }
}
