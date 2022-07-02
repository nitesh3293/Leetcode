import java.util.*;
public class DuplicateZeros {
    public static void main(String[] args) {
        
    }
    public void duplicateZeros(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        int i=arr.length-1,j=arr.length+count-1;
        while(i!=j)
        {
            insert(arr,i,j--);
            if(arr[i]==0)
            {
                insert(arr,i,j--);
            }
        i--;
        }
    }
    private void insert(int[] arr, int i, int j)
    {
        if(j<arr.length)
            arr[j]=arr[i];
    }
}
