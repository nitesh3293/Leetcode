import java.util.*;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int n=0;
       for (int i =0;i<nums.length;i++)
       {
            if(nums[i]==1)
            {
                c++;
                if(c>=n)
                    n=c;
            }
           else
               c=0;
       }
        return n;
    }
}
