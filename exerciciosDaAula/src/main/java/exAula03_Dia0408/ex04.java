package exAula03_Dia0408;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class ex04 {

    public static void main(String[] args) {
        double altura, peso, imc;
        int idade;

        Scanner sc = new Scanner(System.in);
        // peso / altura^2
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        if (idade > 15) {
            System.out.println("Informe sua altura em metros: ");
            altura = sc.nextDouble();
            System.out.println("Informe seu peso em KG: ");
            peso = sc.nextDouble();
            imc = peso / (Math.pow(altura, 2));
            if (imc < 17) {
                System.out.println("Muito abaixo do peso");
            } else if (imc >= 17 && imc <= 18.49) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 18.5 && imc <= 24.99) {
                System.out.println("Peso normal");
            } else if (imc >= 25 && imc <= 29.99) {
                System.out.println("Acima do peso");
            } else if (imc >= 30 && imc <= 32.99) {
                System.out.println("Obesidade I");
            } else if (imc >= 35 && imc <= 39.99) {
                System.out.println("Obesidade II(severa)");
            } else {
                System.out.println("Obesidade III (mórbida)");

            }

        } else {
            throw new RuntimeException("Idade inválida");
        }

    }
}
