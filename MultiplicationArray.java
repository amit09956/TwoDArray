


import java.util.Scanner;

public class MultiplicationArray {
    public static void printTwoD(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void multipli(int arr1[][],int r1,int c1, int arr2[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Enter correct matrix");
            return;
        }
        else{
            int arr3[][]=new int[r1][c2];
            
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<r2;k++){
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            printTwoD(arr3);
        }
        
    } 
    public static void main(String[] args){ 
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row of first matrix:");
        int r1=sc.nextInt();
        System.out.println("Enter the column of the first matrix:");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter the elements of  Array1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number the row of second roow:");
        int r2=sc.nextInt();
        System.out.println("Enter the number of column of second matrix:");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter the values of matrix two");
        System.out.println();
        sc.close();
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        multipli(arr1, r1, c1, arr2, r2, c2);

    }
}

