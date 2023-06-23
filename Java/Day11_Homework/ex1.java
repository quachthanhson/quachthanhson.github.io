package Day11_Homework;

public class ex1 {
    public static void main(String[] args) {
        listPalindromeNumbers(6);
    }

    public static void listPalindromeNumbers(int numDigits) {
        int start = (int) Math.pow(10, numDigits - 1);
        int end = (int) Math.pow(10, numDigits) - 1;

        for (int i = start; i <= end; i++) {
            if (isPalindrome(Integer.toString(i))) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
