package Day2_HomeWork;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày tháng năm sinh (theo định dạng yyyy-mm-dd): ");
        String input = scanner.nextLine();
        scanner.close();

        LocalDate birthDate = LocalDate.parse(input);

        LocalDate currentDate = LocalDate.now();

        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("Tuổi của bạn là: " + age);
    }
}