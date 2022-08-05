package ex13;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        float n1, centena, dezena, unidade;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número de três dígitos: ");
        n1 = sc.nextInt();
        // 165
        // 234
        unidade = (n1 % 10);
        n1 -= unidade;
        dezena = (n1 % 100);
        n1 -= dezena;
        centena = n1;
        System.out.println("CENTENA: " + (int)centena + " | DEZENA: " + (int)dezena + " | UNIDADE: " + (int)unidade);


    }


}
