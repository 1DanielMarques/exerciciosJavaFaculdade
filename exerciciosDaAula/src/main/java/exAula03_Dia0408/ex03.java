package exAula03_Dia0408;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class ex03 {

    public static void main(String[] args) {
        int kwh;
        String tipo;
        double preco = 0, valor;

        Scanner sc = new Scanner(System.in);
        System.out.println("KWh consumidos: ");
        kwh = sc.nextInt();
        System.out.println("Tipo de Instalação");
        System.out.println("R - residencias");
        System.out.println("I - industrias");
        System.out.println("C - comercios");
        tipo = sc.next();

        switch (tipo) {
            case "R":
                if (kwh <= 500) {
                    preco = 0.4;
                } else {
                    preco = 0.65;
                }
                break;
            case "I":
                if (kwh <= 1000) {
                    preco = 0.55;
                } else {
                    preco = 0.6;
                }
                break;
            case "C":
                if (kwh <= 5000) {
                    preco = 0.55;
                } else {
                    preco = 0.6;
                }
                break;
        }
        valor = kwh * preco;
        System.out.println("Valor a pagar: R$" + valor);

    }

}
