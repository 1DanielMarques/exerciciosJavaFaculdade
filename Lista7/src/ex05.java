import java.util.Locale;
import java.util.Scanner;

/**
 * @author Daniel Marques
 */
public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro positivo");
        int n = sc.nextInt();
        System.out.println("--TRIÂNGULO DE PASCAL--");
        int vet[] = new int[n + 1];
        vet[0] = 1;

        for (int i = 0; i <= n; i++) {
            int aux = 0;
            int aux2;
            for (int j = 0; j <= i; j++) {
                aux2 = aux + vet[j];
                aux = vet[j];
                vet[j] = aux2;
                System.out.print(vet[j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
