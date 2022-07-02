import java.util.*;
public class SortArrayByParity {
    public static void main(String[] args) {
        
    }
    public int[] sortArrayByParity(int[] nums) {
        int len =nums.length;
        int[] res=new int[len];
        int l=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]%2==0)
            {
                res[l]=nums[i];
                //nums[i]=nums[i+1];
                l++;
            }
        }
        //for(int i:nums)
        //System.out.print(i);
        for(int i=0;i<len;i++)
        {
            if(nums[i]%2==1)
            res[l++]=nums[i];
        }
        return res;
    }
}
