public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        double[][] mat = new double[3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                mat[i][j] = sc.nextDouble();
            }
        }


    }
}
