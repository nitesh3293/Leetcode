import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        
    }
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;
        while(first <= last)
        {
            char temp= s[first];
            s[first]=s[last];
            s[last]=temp;
            first+=1;
            last-=1;
        }
    }
}
