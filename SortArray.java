

public class SortArray {
    public static void SwapNumber(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    
    public static int [] sorArray(int arr[]){
        int count=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
    }//Solving the question another method
    public static int[] sortOneAndZeros(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                SwapNumber(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        return arr;
    }
    public static void main(String [] args){
        int arr[]={0,1,1,1,0,1,0,1,0,1};
     print(sortOneAndZeros(arr));
    }
    
}

