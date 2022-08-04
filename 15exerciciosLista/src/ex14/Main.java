package ex14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double raio, pi = 3.14, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio da pizza: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.println("Área: " + String.format("%.2f", area) );

    }

}
