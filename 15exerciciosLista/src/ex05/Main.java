package ex05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double reaisGasolina;
        double precoGasolina;
        double litros;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço da gasolina p/Litro: ");
        precoGasolina = sc.nextDouble();
        System.out.println("Informe quantos reais deseja colocar de gasolina: ");
        reaisGasolina = sc.nextDouble();
        litros = reaisGasolina / precoGasolina;
        System.out.println("Litros a serem colocados: " + litros + "L");

    }

}
