package com.quachthanhson;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Bài 2: Tính chu vi và diện tích hình tròn khi biết bán kính của nó.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Bán kính hình tròn: ");
        float r = sc.nextFloat();
        float p = (float) (r*2*Math.PI);
        System.out.println("Chu vi hình tròn là: " + p);
        float s = (float) (r*r*Math.PI);
        System.out.println("Diện tích hình tròn là: " +s);
    }
}
