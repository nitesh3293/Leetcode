import java.util.*;
public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        
    }
    public String reverseWords(String s) {
        char r[]= s.toCharArray();
        int i=0;
        for(int j=0;j<r.length;j++)
        {
            if(r[j]==' ')
            {
                reverse(r,i,j-1);
                i=j+1;
            }
        }
        reverse(r,i,r.length-1);
        return new String(r);
    }
    public void reverse(char r[], int start, int end)
    {
        while(start<end)
        {
            char temp=r[start];
            r[start]=r[end];
            r[end]=temp;
            
            start++;
            end--;
        }
    }
}
