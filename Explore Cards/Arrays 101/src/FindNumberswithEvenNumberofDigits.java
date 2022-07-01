import java.util.*;
public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for( int i: nums)
        {
            String s=String.valueOf(i);
            int len = s.length();
            if(len%2==0)
                count++;
        }
        return count;
    }
}
