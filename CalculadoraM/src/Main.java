import java.util.Scanner;

public class Main {

    public static double resultado = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        char opcao = 'N';
        double n1 = 0;

        do {
            System.out.println("CALCULADORA");
            System.out.println("R: " + resultado);
            calc();
            if (opcao != 'C') {
                System.out.print("N1: ");
                n1 = sc.nextDouble();
            } else {
                n1 = resultado;
            }
            char operacao = sc.next().charAt(0);
            System.out.print("N2: ");
            double n2 = sc.nextDouble();
            switch (operacao) {
                case '+':
                    resultado = n1 + n2;
                    break;
                case '-':
                    resultado = n1 - n2;
                    break;
                case '*':
                    resultado = n1 * n2;
                    break;
                case '/':
                    resultado = n1 / n2;
                    break;
            }
            System.out.println(n1 + " " + operacao + " " + n2 + " = " + resultado);
            Thread.sleep(1000);
            System.out.println("\nC - Continuar");
            System.out.println("L - Limpar");
            System.out.println("F - Finalizar");
            opcao = sc.next().charAt(0);
            if (opcao == 'L') {
                resultado = 0;
            }


        } while (opcao != 'F');

        sc.close();
    }

    public static void calc() {
        System.out.println("1 2 3 +");
        System.out.println("4 5 6 -");
        System.out.println("7 8 9 *");
        System.out.println("  0   /");
    }


}
