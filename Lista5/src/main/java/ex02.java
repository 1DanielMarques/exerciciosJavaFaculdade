public class ex02 extends AuxScanner {
    public static void main(String[] args) {
        int numero;
        int resultado = 0;
        System.out.println("Informe um número");
        numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            if ((resultado % 2) != 0) {
                System.out.println(numero + " X " + i + " = " + resultado);
            }

        }
    }

}
