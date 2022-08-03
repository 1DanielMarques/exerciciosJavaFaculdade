package ex06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int precoPao = 12, peso, valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o peso do prato em KG: ");
        peso = sc.nextInt();
        valor = peso * precoPao;
        System.out.println("Valor a pagar: R$" + valor);

    }

}
