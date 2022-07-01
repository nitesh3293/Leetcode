import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
    
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiral = new ArrayList<Integer>();
        int row = matrix.length;
        if(row==0)
            return spiral;
        int col = matrix[0].length;
        
        int l=0,r=col-1,t=0,b=row-1,d=0;
        while(l<=r && t<=b)
        {
            if(d==0)
            {
                for(int i=l;i<=r;i++)
                spiral.add(matrix[t][i]);
                t++;
                d=1;
            }
            else if(d==1)
            {
                for(int i=t;i<=b;i++)
                spiral.add(matrix[i][r]);
                r--;
                d=2;
            }
            else if(d==2)
            {
                for(int i=r;i>=l;i--)
                spiral.add(matrix[b][i]);
                b--;
                d=3;
            }
            else if(d==3)
            {
                for(int i=b;i>=t;i--)
                spiral.add(matrix[i][l]);
                l++;
                d=0;   
            }
        }
        return spiral;
    }
}
