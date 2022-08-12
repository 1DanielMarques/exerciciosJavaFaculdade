/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exAula_dia_1108;

import java.util.Scanner;

/**
 *
 * @author mDanielSE
 */
public class ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        double aux;

        System.out.println("Informe 3 números");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        double lista[] = new double[3];

        int verifica = 1;
        while (verifica == 1) {
            verifica = 0;
            for (int i = 0; i <= 1; i++) {
                if (lista[i] > lista[i + 1]) {
                    verifica = 1;
                    aux = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = aux;

                }
            }
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println(lista[i]);
        }

    }
}
