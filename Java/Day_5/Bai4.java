package Day5;

public class Bai4 {
    public static void main(String[] args) {
        int n=1;
        for (int i = 1; i <=5; i++) {
            for(int j = 1; j<=i;j++){
                System.out.print(n++ + " ");
            }
            System.out.println();
        }
    }
}