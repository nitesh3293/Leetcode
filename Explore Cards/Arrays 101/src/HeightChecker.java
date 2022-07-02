import java.util.*;
public class HeightChecker {
    public static void main(String[] args) {
        
    }
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] exp = new int[len];
        int count=0;
        for(int i=0;i<len ;i++)
            exp[i]=heights[i];
        Arrays.sort(exp);
        for(int i=0;i<len;i++)
        {
            if(heights[i]!=exp[i])
                count++;
        }
        return count;
    }
}
