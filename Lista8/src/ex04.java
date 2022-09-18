/**
 * @author Daniel Marques
 */
public class ex04 extends AuxScanner {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int maior = 0, x = 0, y = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                mat[i][j] = sc.nextInt();
                if (i == 0 && j == 0) {
                    maior = mat[i][j];
                }
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("--MAIOR--");
        System.out.println("Linha: " + (x + 1) + " Coluna: " + (y + 1));

    }
}
