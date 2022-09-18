public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int cont = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                mat[i][j] = sc.nextInt();
                if (mat[i][j] > 10) {
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de numeros maiores que 10: " + cont);

    }
}
