import java.util.*;
public class SquaresofaSortedArraySquaresofaSortedArray {
    public static void main(String[] args) {
        
    }
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i]= nums[i]*nums[i];
        }
        //for(int i=0;i<n;i++)
        //System.out.print(nums[i]+" ");
        int i,j,k;
        for( i=1;i<n;i++)
            {
                 k=nums[i];
                for(j=i-1;j>=0 && k<nums[j]; j--)
                    nums[j+1]=nums[j];
                nums[j+1]=k;
            }
        return nums;
    }
}
