public class ex02 extends AuxScanner{
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    mat[i][j] = 1;
                }else{
                    mat[i][j] = 0;
                }
            }
        }
        for(int i=0;i<mat.length;i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
