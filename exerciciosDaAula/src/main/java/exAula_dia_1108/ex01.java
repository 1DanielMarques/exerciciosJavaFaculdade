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
public class ex01 {

    public static void main(String[] args) {

        double n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 3 números");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        
        if(n1 > (n2+n3)){
            System.out.println(n1 + " é maior que a soma dos outros 2");
        }else{
            System.out.println(n1+" não é maior que a soma dos outros 2");
        }

    }

}
