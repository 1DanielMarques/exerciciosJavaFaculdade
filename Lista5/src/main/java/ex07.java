public class ex07 extends AuxScanner {
    public static void main(String[] args) throws InterruptedException {
        double n1 = 0, n2 = 0, resultado = 0;
        int opcao, opcaoConta;
        do {
            System.out.println("--CALCULADORA--");
            System.out.print(" 1 ");
            System.out.print(" 2 ");
            System.out.println(" 3 ");
            System.out.print(" 4 ");
            System.out.print(" 5 ");
            System.out.println(" 6 ");
            System.out.print(" 7 ");
            System.out.print(" 8 ");
            System.out.println(" 9 ");
            if (resultado == 0) {
                System.out.print("Informe um número: ");
                n1 = sc.nextDouble();
                System.out.print("Informe outro número: ");
                n2 = sc.nextDouble();
            } else {
                n1 = resultado;
                System.out.print("Informe um número: ");
                n2 = sc.nextDouble();
            }
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Zerar calculadora");
            System.out.println("9 - Finalizar");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    resultado = n1 / n2;
                    break;
                case 5:
                    resultado = 0;
                    break;
            }
            System.out.println("Resultado: " + resultado);
            Thread.sleep(2000);

        } while (opcao != 9);
    }
}
