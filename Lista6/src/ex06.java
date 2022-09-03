import java.util.Scanner;

public class ex06 extends AuxScanner {
    public static void main(String[] args) {
        int vet[] = new int[5];
        int x = 0;
        System.out.println("Informe 10 numeros");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Informe um numero x");
        x = sc.nextInt();
        System.out.println("Múltiplos de " + x + ": ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % x == 0) {
                System.out.print(" | " + vet[i]);
            }
        }


    }
}
