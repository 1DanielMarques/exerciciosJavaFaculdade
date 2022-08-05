package ex07;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int mes;
        int dia;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o dia: ");
        dia = sc.nextInt();
        System.out.print("Informe o número do mês: ");
        mes = sc.nextInt();

        mes = (mes -1)*30;
        dia += mes;
        System.out.println("Passaram-se " + dia + " dias");


    }

}
