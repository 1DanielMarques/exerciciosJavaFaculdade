package ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números inteiros");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("Resultado: " + c);
        
    }

}
