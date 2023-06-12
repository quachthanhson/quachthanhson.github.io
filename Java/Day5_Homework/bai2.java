package Day5_Homework;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        for (int num = 1000000; num <= 9999999; num++) {
            if (isPrime(num) && allDigitsArePrime(num) && isPrime(reverseNumber(num))) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean allDigitsArePrime(int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (!isPrime(digit)) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}

