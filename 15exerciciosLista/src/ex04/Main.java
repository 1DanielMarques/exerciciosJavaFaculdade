package ex04;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String nome;
        int idade; // 1 ano como 365 dias
        int dias;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.print("Informe sua idade: ");
        idade = sc.nextInt();
        dias = idade * 365;
        System.out.println(nome + " você já viveu " + dias + " dias");


        

    }

}
