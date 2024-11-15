



import java.util.Scanner;

public class Rotate90Degree {
    public static void printTwoD(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
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
    }
    public static  void rotate90DEgree(int arr[][],int r){
        transposeMatrix(arr, r, r);
        for(int i=0;i<r;i++){
            reverseArray(arr[i]);
        }
        printTwoD(arr);

     

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column");
        int r=sc.nextInt();
        int arr[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        rotate90DEgree(arr, r);

    }
    
}

