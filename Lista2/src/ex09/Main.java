package ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double altura, peso;
        String sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura: ");
        altura = sc.nextDouble();
        System.out.println("Sexo: F/M");
        sexo = sc.next();

        if (sexo.equals("F")) {
            peso = (62.1 * altura) - 44.7;
        } else {
            peso = (72.7 * altura) - 58;
        }
        System.out.println("Peso ideal: " + String.format("%.2f", peso));

    }

}
