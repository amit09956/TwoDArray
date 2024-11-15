

import java.util.*;

public class TriangleSumQuardinates {
    // first aproach
    public static void sumQuardinates(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    // second aproach
    public static void prefixSumOfMatrix(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    public static int findSum(int arr[][], int l1, int r1, int l2, int r2) {
        prefixSumOfMatrix(arr);
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += arr[i][r2] - arr[i][r1 - 1];
            } else {
                sum += arr[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements iof the array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enetr the Quardinates");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        sumQuardinates(arr, l1, r1, l2, r2);
        System.out.println(findSum(arr, l1, r1, l2, r2));
        sc.close();

    }

}

