import java.util.*;
public class ValidMountainArray {
    public static void main(String[] args) {
        
    }
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int fcount=0;
        int rcount=arr.length-1;
        //int i=0,j=arr.length-1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
                fcount++;
            else break;
        }
        for(int j=arr.length-1;j>0;j--)
        {
            if(arr[j]<arr[j-1])
                rcount--;
            else break;
        }
        if(fcount!=rcount || fcount==arr.length-1 ||rcount==0)
            return false;
        else
            return true;
    }
}
