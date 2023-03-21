import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("nhập cột muốn tính tổng ");
        int colum = sc.nextInt();
        int total = 0;
        if (colum < 0 || colum > 6) {
            System.out.println("Không có giá trị thỏa mãn");
        } else {
            for (int i = 0; i < 5; i++) {
                total += matrix[i][colum - 1];
            }
            System.out.println("Tổng của cột thứ " + colum + " là " + total);
        }
    }
}