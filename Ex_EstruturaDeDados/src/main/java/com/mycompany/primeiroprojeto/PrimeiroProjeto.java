package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/*
 * @author mDanielSE
 */
public class PrimeiroProjeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor;
        float valor2;
        float soma;
        String nome;
      

        System.out.println("Informe um valor inteiro: ");
        valor = sc.nextInt();
        valor2 = sc.nextFloat();
        soma = valor + valor2;
        System.out.println("A soma foi: " + soma);
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        nome = sc.nextLine();
        System.out.println("O nome informado é: " + nome);

    }

}
