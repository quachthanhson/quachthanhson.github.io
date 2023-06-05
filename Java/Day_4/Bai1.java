package Day_4;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Nhập n=");
            int n = sc.nextInt();
            int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d] = ",i);
            array[i] = sc.nextInt();
        }

        System.out.print("[ ");
        for (int i = 0; i< array.length; i++){
            if (array[i]%2==0){
                array[i] = array[i]+1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        }
    }