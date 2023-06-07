public class Bai1 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 3}; // Mảng số nguyên đầu vào

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Tìm giá trị nhỏ nhất và lớn nhất trong mảng
        for (int number : numbers) {
            sum += number;

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        int average = (sum - min - max) / (numbers.length - 2); // Tính giá trị trung bình

        System.out.println("Giá trị trung bình (loại bỏ giá trị nhỏ nhất và lớn nhất): " + average);
    }
}

