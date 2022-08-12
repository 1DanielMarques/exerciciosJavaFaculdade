package exAula_dia_1108;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, resultado=0;
        int opcao;
        System.out.println("Informe dois valores fracionários");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
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
                System.out.println("Escolha a ordem da divisão:");
                System.out.println("1 - " + n1 + " / " + n2);
                System.out.println("2 - " + n2 + " / " + n1);
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        resultado = n1 / n2;
                        break;
                    case 2:
                        resultado = n2 / n1;
                        break;
                }
                break;
        }
        System.out.println("Resultado: " + resultado);

    }
}
