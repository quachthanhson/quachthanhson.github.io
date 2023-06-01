package Day_2;

import java.util.Random;
import java.util.Scanner;

public class Sosanh2so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("nhập 1 số bất kì:");
        String s;
        int a = sc.nextInt();
        int b = rand.nextInt(100)+1;
        System.out.println("Số nhập vào: " + a);
        System.out.println("Số ngẫu nhiên từ 1 --> 100: " + b );
        s = (a>b)?  "Số nhập lớn hơn số ngẫu nhiên": "Số nhập nhỏ hơn số ngẫu nhiên";
        System.out.println(s);
    }
}
