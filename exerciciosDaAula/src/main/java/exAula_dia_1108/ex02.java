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
public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velocidade, velocidadeMaxima;

        System.out.println("Informe a velocidade do carro");
        velocidade = sc.nextInt();
        System.out.println("Informe a velocidade máxima da rua");
        velocidadeMaxima = sc.nextInt();
        int resultado = velocidade - velocidadeMaxima;
        if ((resultado) <= 10 && resultado != 0) {
            System.out.println("50 reais");
        }else if(resultado >=11 && resultado <=30){
            System.out.println("100 reais");
        }else{
            System.out.println("300 reais");
        }

    }
}
