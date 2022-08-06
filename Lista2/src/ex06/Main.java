package ex06;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        double n1,n2,n3, maior;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe três números");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        /*
         * 123  
         * 321
         * 132
         * 312
         * 213
         * 231
         */

        if(n1 < n2 && n2 < n3){
            maior = n2;
        }else if(n2 < n1 && n1 < n3){
            maior = n3;
        }


    }

}
