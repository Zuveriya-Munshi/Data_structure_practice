
public class SetMat0 {
        public static void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n =matrix[0].length;
            boolean [] row = new boolean[m];
            boolean [] col = new boolean[n];
            int i,j;
            for( i=0;i<m;i++){
                for( j=0;j<n;j++){
                    if(matrix[i][j]== 0){
                        row[i] = true;
                        col[j] = true;
                    }
                    
                }
            }
             for( i=0;i<m;i++){
                for( j=0;j<n;j++){
                    if(row[i] || col[j]){
                        matrix[i][j]=0;
                    }
                }
             }
             for(int[] x : matrix){
                for(int y : x){
                    System.out.print(y + " ");
             }
             System.err.println();
            }
        }
        public static void main(String []args){
           int mat[][] = {{0,1,2,0},{3,4,5,2},{1,2,1,5}};
           int mat1[][] = {{1,1,1},{1,0,1},{1,1,1}};
           setZeroes(mat);
           setZeroes(mat1);

        }
    
    
}
