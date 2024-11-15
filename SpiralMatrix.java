

import java.util.*;

public class SpiralMatrix {


    public static void spiral_Matrix(int arr[][], int r, int c) {
        int top_row = 0, bottom_row = r - 1, left_column = 0, right_column = c - 1;
        int totalElement = 0;
        while (totalElement < (r * c)) {
            // top_row-> left_column to right_column
            for (int j = left_column; j <= right_column && totalElement < (r * c); j++) {
                System.out.print(arr[top_row][j] + " ");
                totalElement++;
            }
            top_row++;
            // right_column-> top_row to bottom_row
            for (int i = top_row; i <= bottom_row && totalElement < (r * c); i++) {
                System.out.print(arr[i][right_column] + " ");
                totalElement++;
            }
            right_column--;
            // bottom+row-> right_coluumn to left_column
            for (int j = right_column; j >= left_column && totalElement < (r * c); j--) {
                System.out.print(arr[bottom_row][j] + " ");
                totalElement++;
            }
            bottom_row--;
            // left_column-> bottom_row to top_row
            for (int i = bottom_row; i >= top_row && totalElement < (r * c); i--) {
                System.err.print(arr[i][left_column] + " ");
                totalElement++;
            }
            left_column++;
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row ");
        int r = sc.nextInt();
        System.out.println("Enter the size o0f column");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int totalElement = r * c;
        System.out.println("Enter the total elments " + totalElement);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiral_Matrix(arr, r, c);
        sc.close();

    }

}

