
import java.util.*;
import java.util.Collections;
public class IntersectionOf2dArrays {
    public static List<Integer> intersection(int[][] nums) {
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer>inter=new HashMap<>() ;
            
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                   // store the occurence of each element
                    inter.put(nums[i][j],inter.getOrDefault(nums[i][j],0)+1); 
            }
        }
        for(Integer i:inter.keySet()){
            if(inter.get(i)==n){
                list.add(i);
        }
        
    }
    Collections.sort(list);
    return list;
}

    public static void main(String[] args) {
        int arr[][]={{3,1,2,4,5},{2,1,4,3}};
        System.out.println(intersection(arr));
    }
    
}
