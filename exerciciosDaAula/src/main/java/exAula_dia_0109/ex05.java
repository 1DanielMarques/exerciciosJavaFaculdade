package exAula_dia_0109;

public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        double x[] = new double[10];
        double y[] = new double[10];
        double resultado = 0, aux = 0;
        System.out.println("Vetor x");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            x[i] = sc.nextDouble();
        }
        System.out.println("Vetor y");
        for (int j = 0; j < y.length; j++) {
            System.out.print("Numero " + (j + 1) + ": ");
            y[j] = sc.nextDouble();
        }

        for (int k = 0; k < x.length; k++) {
            aux = x[k] * y[k];
            resultado += aux;
        }
        System.out.println("Produto escalar: " + resultado);
    }
}
