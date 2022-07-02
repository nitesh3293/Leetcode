import java.util.*;
public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        
    }
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr.length-1;j>i;j--)
            {
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i])
                    return true;
            }
        }
        return false;
    }
}
