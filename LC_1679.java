
import java.util.Arrays;

public class LC_1679 {
    public static int maxOperations(int[] nums, int k) {
       int count = 0;
       Arrays.sort(nums); //1 3 3 3 4
       int i=0,j=nums.length-1;
       while(i<j){
        if(nums[i]+nums[j]==k){
            count++;
            i++;
            j--;
        }
        else if(nums[i]+nums[j] < k){
            i++;
        }
        else{
            j--;
        }
    }
    return count;
}

      
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,3}; 
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
}
