package exAula03_Dia0408;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 * @author mDanielSE
 */
public class ex01 {

    public static void main(String[] args) {
        double n1, n2, resultado = 0;
        int opcao;

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");;
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe dois números: ");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                resultado = n1 + n2;

                break;
            case 2:
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                resultado = n1 - n2;

                break;
            case 3:
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                resultado = n1 * n2;
                break;
            case 4:
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();
                resultado = n1 / n2;
                break;
        }
        System.out.println("Resultado: " + resultado);

        /*  int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Número: ");
        numero = teclado.nextInt();

        // if(numero % 2  1)
        if (numero % 2 != 0) {
            System.out.println("Ímpar");
        } else {
            System.out.println("Par");

        } */
    }
}
