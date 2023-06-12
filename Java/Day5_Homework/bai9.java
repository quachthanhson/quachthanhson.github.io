package Day5_Homework;

public class bai9 {
    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số và tổng chữ số chia hết cho 10:");

        for (int i = 100001; i <= 999999; i++) {
            if (isPalindrome(i) && sumOfDigits(i) % 10 == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        String strNumber = String.valueOf(number);
        int length = strNumber.length();

        for (int i = 0; i < length / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}