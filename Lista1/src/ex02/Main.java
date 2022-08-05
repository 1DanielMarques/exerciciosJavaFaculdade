package ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ferradura;
        int cavalo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de cavalos: ");
        cavalo = sc.nextInt();
        ferradura = cavalo * 4;
        System.out.println("Serão necessárias " + ferradura + " ferraduras.");

    }

}
