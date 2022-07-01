import java.util.*;
public class AddBinary {
    public static void main(String[] args) {
        
    }
    public String addBinary(String a, String b) {
        StringBuilder ans= new StringBuilder();
        int alen=a.length()-1;
        int blen=b.length()-1;
        int carry=0;
        
        while(alen>=0 || blen>=0)
        {
            int sum = carry;
            if(alen>=0)
            sum+=a.charAt(alen)-'0';
            if(blen>=0)
            sum+=b.charAt(blen)-'0';
            ans.append(sum%2);
            carry=sum/2;
            alen--;
            blen--;
        }
        if(carry!=0)
            ans.append(carry);
        return ans.reverse().toString();
    }
}
