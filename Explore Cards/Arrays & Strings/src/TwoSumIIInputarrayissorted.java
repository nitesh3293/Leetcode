import java.util.*;
public class TwoSumIIInputarrayissorted {
    public static void main(String[] args) {
        
    }
    public int[] twoSum(int[] numbers, int target) {
       // int[] res= new int[2];
        int n= numbers.length;
        int first=0,last=n-1;
        while(first<last)
        {
            if(numbers[first]+numbers[last]>target)
                last--;
            else if(numbers[first]+numbers[last]<target)
                first++;
            else
                return new int[]{first+1,last+1};
        }
        return new int[]{};
    }
}
