import java.util.*;
public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> res= new ArrayList<>();
        Set<Integer> temp= new HashSet<>();
        for(int i=0;i<len;i++)
        {
            temp.add(nums[i]);
        }
        for(int i=1;i<=len;i++)
        {
            if(!temp.contains(i))
                res.add(i);
        }
        return res;
    }
}
