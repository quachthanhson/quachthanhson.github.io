package Day4_Homework;

public class Bai2 {
        public static void main(String[] args) {
            String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
            String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

            System.out.println("Các phần tử xuất hiện trong cả hai mảng:");
            for (String element : array1) {
                for (String value : array2) {
                    if (element.equals(value)) {
                        System.out.println(element);
                        break;
                    }
                }
            }
        }
}
