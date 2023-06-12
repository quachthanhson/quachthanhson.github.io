package Day5_Homework;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        for (int num = 1000000; num <= 999999999; num++) {
            if (isPalindrome(num) && hasValidDigits(num) && isSumDivisibleByTen(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        StringBuilder reversed = new StringBuilder(numStr).reverse();
        return numStr.equals(reversed.toString());
    }

    public static boolean hasValidDigits(int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            if (digit != '0' && digit != '6' && digit != '8') {
                return false;
            }
        }
        return true;
    }

    public static boolean isSumDivisibleByTen(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 10 == 0;
    }
}

