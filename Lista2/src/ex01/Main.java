package ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double A, B, C;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 3 valores");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if((A+B)>C){
            System.out.println("A soma entre A + B é igual a " + (A+B));

        }


    }

}
