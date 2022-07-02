import java.util.*;
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        
    }
    public int thirdMax(int[] nums) {
        Integer max= null;
        Integer smax=null;
        Integer tmax=null;
        
        for(Integer i: nums)
        {
            if(i.equals(max) || i.equals(smax) || i.equals(tmax))
                continue;
            
            if(max==null || i>max)
            {
                tmax=smax;
                smax=max;
                max=i;
            }
            else if(smax==null || i>smax)
            {
                tmax=smax;
                smax=i;
            }
            else if(tmax== null || i>tmax)
            {
                tmax=i;
            }
        }
        if(tmax==null)
            return max;
        
        return tmax;
    }
}
