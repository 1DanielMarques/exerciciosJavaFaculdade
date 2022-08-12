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
        double n1, n2, n3, maior=0, meio=0, menor=0;

        System.out.println("Informe 3 números");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        if (n1 < n2 && n2 < n3) { //1 2 3
            maior = n3;
            meio = n2;
            menor = n1;
        } else if (n1 < n3 && n3 < n2) { // 1 3 2
            maior = n2;
            meio = n3;
            menor = n1;
        } else if (n2 < n1 && n1 < n3) { // 2 1 3
            maior = n3;
            meio = n1;
            menor = n2;
        } else if (n2 < n3 && n3 < n1) { // 3 1 2
            maior = n1;
            meio = n3;
            menor = n2;
        } else if (n3 < n2 && n2 < n1) { //3 2 1
            maior = n1;
            meio = n2;
            menor = n3;
        }else if(n3 < n1 && n1 < n2) { // 2 3 1
            maior = n2;
            meio = n1;
            menor = n3;
        }

        System.out.println("Menor: " + menor);
        System.out.println("Meio: " + meio);
        System.out.println("Maior: " + maior);
        

    }
}
