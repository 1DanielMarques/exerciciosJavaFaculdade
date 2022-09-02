package exAula_dia_0109;

public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        System.out.println("Soma: " + soma);
    }
}
