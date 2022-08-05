package ex15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double valorConta, valorAux, comCentavo;
        double semCentavo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Total: ");
        valorConta = sc.nextDouble();
        // 101,53
        valorAux = valorConta / 3; // 33,84
        valorAux *= 100; // 3384
        semCentavo = (valorAux % 100); // 84
        semCentavo = (valorAux - semCentavo); //
        semCentavo /= 100; // 33

        valorAux = semCentavo * 2; // 66
        comCentavo = valorConta - valorAux;

        System.out.println("Carlos: R$" + String.format("%.2f", semCentavo) );
        System.out.println("André: R$" + String.format("%.2f", semCentavo));
        System.out.println("Felipe: R$" + String.format("%.2f", comCentavo));
    }

}
