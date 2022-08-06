package ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor");
        n1 = sc.nextDouble();
        if (n1 % 2 == 0) {
            n1 += 5;
        } else {
            n1 += 8;
        }
        System.out.println("Resultado: " + n1);

    }

}
