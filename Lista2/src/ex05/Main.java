package ex05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        numero = sc.nextInt();
        if (numero > 0) {
            numero *= 2;
        } else if (numero < 0) {
            numero *= 3;
        }
        System.out.println("Resultado: " + numero);
    }

}
