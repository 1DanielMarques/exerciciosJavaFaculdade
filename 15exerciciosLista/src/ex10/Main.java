package ex10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x1, y1, x2, y2, distancia, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 1º ponto (x,y): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Informe 2º ponto (x,y)");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        // x = (x2 - x1);
        // y = (y2 - y1);
        // Math.sqrt(numero);
        x = Math.pow((x2 - x1), 2);
        y = Math.pow((y2 - y1), 2);
        distancia = Math.sqrt((x + y));
        System.out.println("Distância: " + distancia);

    }

}
