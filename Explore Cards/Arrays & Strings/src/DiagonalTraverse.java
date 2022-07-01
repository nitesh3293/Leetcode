import java.util.*;
public class DiagonalTraverse {
    public static void main(String[] args) {
        
    }
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0)
            return new int[0];
        
        int row = mat.length;
        int col = mat[0].length;
        int[] res= new int[row*col];
        int sum=0;
        
        ArrayList<Integer> midway =new ArrayList<Integer>();
        
        for(int i=0; i<row+col-1;i++)
        {
            midway.clear();
            
            int r = i < col ? 0 : i-col+1;
            int c = i < col ? i : col-1;
            
            while( r < row && c>-1)
            {
                midway.add(mat[r][c]);
                ++r;
                --c;
            }
            
            if(i%2 == 0)
                Collections.reverse(midway);
            for(int j=0 ; j <  midway.size(); j++)
                res[sum++] = midway.get(j);
        }
        return res;
    }
}
