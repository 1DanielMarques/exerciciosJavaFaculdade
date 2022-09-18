/**
 * @author Daniel Marques
 */
public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i * j;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
