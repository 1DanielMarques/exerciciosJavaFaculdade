package exAula03_Dia0408;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class ex02 {

    public static void main(String[] args) {
        // Programa bancário para aprovação de empréstimos
        double emprestimo = 0, salario,  prestacao;
        int i = 0, meses;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário: ");
        salario = sc.nextDouble();
        while (i == 0) {
            System.out.println("Informe o valor do empréstimo: ");
            emprestimo = sc.nextDouble();
            if (emprestimo > (salario * 0.3)) {
                System.out.println("Empréstimo maior que 30% do salário!");
            } else {
                i = 1;
            }
        }

        System.out.println("Informe a quantidade de meses: ");
        meses = sc.nextInt();
        prestacao = emprestimo / meses;
        System.out.println("Valor da prestação/mes: R$" + prestacao + " por " + meses + " meses");

    }

}
