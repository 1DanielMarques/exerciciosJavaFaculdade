import java.util.Scanner;

/**
 * @author Daniel Marques
 */
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5];
        int maior, menor;
        System.out.println("Informe 5 valores inteiros");
        // 3 5 2 4 6
        for (int i = 0; i < vet.length; i++) {
            System.out.print((i + 1) + "º número: ");
            vet[i] = sc.nextInt();
        }
        maior = vet[0];
        menor = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            } else if (vet[i] < menor) {
                menor = vet[i];
            }
        }


        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
