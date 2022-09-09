import java.util.Scanner;

/**
 * @author Daniel Marques
 */
public class ex03 {
    public static void main(String[] args) {
        double tempo = 50;
        double vet[] = new double[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a massa: ");
        vet[0] = sc.nextDouble();
        vet[1] = vet[0];
        vet[5] = 0;
        while (vet[1] > 0.5) {
            vet[1] = vet[1] / 2;
            vet[5]++;
        }
        vet[2] = tempo * vet[5];
        vet[3] = vet[2] / 60;
        vet[4] = vet[3] / 60;
        System.out.println("Massa INICIAL: " + vet[0]);
        System.out.println("Massa FINAL: " + vet[1]);
        System.out.println("Horas: " + vet[4]);
        System.out.println("Minutos: " + vet[3]);
        System.out.println("Segundos: " + vet[2]);
        sc.close();
    }
}
