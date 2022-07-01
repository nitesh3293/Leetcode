import java.util.*;
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0) 
            return 0;
        
        int j=1;
        int len = nums.length;
        
        for(int i=0;i<len-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                 nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
}
