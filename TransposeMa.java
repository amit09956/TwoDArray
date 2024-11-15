
import java.util.Scanner;

public class TransposeMa {
    public static void printTwoD(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void transposeMatrix(int arr[][],int r,int c){
        //int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=i ;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
               
            }
        }
        printTwoD(arr);
       

    }//=======another method=========
    public static int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int r=sc.nextInt();
        System.out.println("Enter Colonm");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the"+r*c+"Elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        //transposeMatrix(arr, r, c);
        printTwoD(transpose(arr));
        sc.close();
        
    }
    
}
