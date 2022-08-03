package ex12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salario, porcentagem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        salario = sc.nextDouble();
        System.out.println("Salário inicial: R$" + salario);
        porcentagem = salario;
        porcentagem *= 0.15;
        salario += porcentagem;
        System.out.println("Salário com 15% de aumento: R$" + salario);
        porcentagem = salario * 0.08;
        salario -= porcentagem;
        System.out.println("Salário com 8% de impostos: R$" + salario);

    }

}
