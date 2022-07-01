import java.util.*;
public class FindPivotIndex {
    public static void main(String[] args) {
        
    }
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int right=0;
        int left =0;
        for(int i=0;i<n;i++)
        {
            right+=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            right-=nums[i];
            //System.out.print(right);
            if(left==right)
                return i;
            else
            {
                left+=nums[i];
                //system.out.print(left);
                //right-=nums[i];
                //system.out.print(right);
            }
        }
        return -1;
    }
}
