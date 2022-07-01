import java.util.*;
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        
    }
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        
        int first=0;
        int sum=0;
        
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            
            while(sum>=target)
            {
                res= Math.min(res,i+1-first);
                sum-=nums[first];
                first++;
            }
        }
        return (res!= Integer.MAX_VALUE)?res:0;
    }
}
