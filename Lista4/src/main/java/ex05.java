public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        int n;
        int resultado;
        System.out.println("Informe um número");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = n * i;
            System.out.println(n + " X " + i + " = " + resultado);
        }

    }
}
