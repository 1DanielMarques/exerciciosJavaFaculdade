/**
 * CORRIGIDO: OK
 *
 * @author Daniel Marques
 */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maior = 0, menor = 0;
        System.out.println("Informe 5 valores inteiros");
        // 3 5 2 4 6
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"º número: ");
            numero = sc.nextInt();
            if (i == 0) {
                maior = numero;
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
