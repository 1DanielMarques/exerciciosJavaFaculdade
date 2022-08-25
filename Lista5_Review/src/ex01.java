public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        int numero, resultado;
        System.out.print("Informe um número: ");
        numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            if (resultado % 2 == 0) {
                System.out.println(numero + "x" + i + "= " + resultado);
            }

        }


    }
}
