package Day3_Homework;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i%3==0 && i%15!=0){
                System.out.println("Fizz");
            } else if (i%5==0 && i%15!=0) {
                System.out.println("Buzz");
            } else if (i%15==0) {
                System.out.println("FizzBuzz");
            }
            System.out.println(i);
        }
    }
}
