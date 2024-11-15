



import java.util.*;

public class SpiralOrder_II {
    public static void printTwoD(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static int[][] spira_II(int n) {
        int top_row = 0, bottom_row = n - 1, left_column = 0, right_column = n - 1;
        int curr = 1;
        int arr[][] = new int[n][n];
        while (curr <= (n * n)) {
            // top_row-> left_column to right_column
            for (int j = left_column; j <= right_column && curr <= (n * n); j++) {
                arr[top_row][j] = curr++;

            }
            top_row++;
            // right_column-> top_row to bottom_row
            for (int i = top_row; i <= bottom_row && curr <(n * n); i++) {
                arr[i][right_column] = curr;
                curr++;
            }
            right_column--;
            // bottom+row-> right_coluumn to left_column
            for (int j = right_column; j >= left_column && curr <(n * n); j--) {
                arr[bottom_row][j] = curr;
                curr++;
            }
            bottom_row--;
            // left_column-> bottom_row to top_row
            for (int i = bottom_row; i >= top_row && curr <(n * n); i--) {
                arr[i][left_column] = curr;
                curr++;
            }
            left_column++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = spira_II(n);
        printTwoD(arr);
        sc.close();
    }
}
