
import java.util.*;
public class PascalsArray {
    public static void printTwoD(int arr[][]){
    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j]);
            }
           System.out.println();
            
        }
       
    }
   
    public static void pascalTringle(int n){
        int arr[][]=new int[n][];
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            //arr[i]=new int [i+1]
            //arr[2]=new int [2+1]
            arr[i]=new int[i+1];
            //first and last row of every element is 1
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        printTwoD(arr);
        
       
    }
    public static void main(String []args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>>list=new ArrayList<>();
        pascalTringle(n);
     

        
    }
    
}

