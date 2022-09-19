import java.util.Scanner;

public class Main {

    public static int resultado = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        char opcao = 'N';


        do {
            System.out.println("CALCULADORA");
            calc();
            int n1 = sc.nextInt();
            System.out.println(n1);
            char operacao = sc.next().charAt(0);
            System.out.println(n1 + " " + operacao);
            int n2 = sc.nextInt();
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
