package Day3_Homework;

public class Bai2 {
        public static void main(String[] args) {
            String str = "hello";
            char mostFrequentChar = findMostFrequentChar(str);
            System.out.println("Ký tự xuất hiện nhiều nhất trong chuỗi là: " + mostFrequentChar);
        }

        private static char findMostFrequentChar(String str) {
            char[] charArray = str.toCharArray();
            int[] charCount = new int[256];

            for (char ch : charArray) {
                charCount[ch]++;
            }

            char mostFrequentChar = ' ';
            int maxCount = 0;

            for (char ch : charArray) {
                if (charCount[ch] > maxCount) {
                    maxCount = charCount[ch];
                    mostFrequentChar = ch;
                }
            }

            return mostFrequentChar;
        }
    }
