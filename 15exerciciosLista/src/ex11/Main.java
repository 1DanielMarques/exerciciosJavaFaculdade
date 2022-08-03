package ex11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        double anos,dias, mes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de dias sem acidentes: ");
        dias = sc.nextInt();

        mes = dias / 30;
        anos = mes / 12;
        System.out.println("Anos sem acidentes: " + String.format("%.2f", anos) + " ano(s)");

    }

}
