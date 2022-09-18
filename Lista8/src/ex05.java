/**
 * @author Daniel Marques
 */
public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        boolean verifica = false;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Valor X: ");
        int x = sc.nextInt();
        int linha = 0, coluna = 0;


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    verifica = true;
                    System.out.println("Valor: " + x);
                    System.out.println("Linha: " + (i + 1) + " Coluna: " + (j + 1));
                    break;
                }
            }
        }
        if (!verifica) {
            System.out.println("Não encontrado");
        }

    }
}
