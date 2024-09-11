import java.util.*;
class PascalTriangle{
    public static List<List<Integer>> pascalTri(int numsRows){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> row,pre= null;
        for(int i=0;i<numsRows;i++){
            row  = new ArrayList<Integer>();
           for(int j=0;j<=i;j++){
            //At the both sides 1 
            if(j==0 || j==i){
                row.add(1);
            }
            // a[i][j] =  a[i-1][j-1] + a[i-1][j]
            else{
                row.add(pre.get(j-1)+pre.get(j));
            }
           }
           pre=row;
           ans.add(row); 
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans = pascalTri(5);
        for(List<Integer> row : ans){
            System.out.println(row);
        }
    }
}
