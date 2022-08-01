package ex08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1, n2, n3, p1, p2, p3;
        p1 = 1;
        p2 = 2;
        p3 = 3;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe respectivamente as 3 notas: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / 6;
        System.out.println("Média: " + media);

    }

}
