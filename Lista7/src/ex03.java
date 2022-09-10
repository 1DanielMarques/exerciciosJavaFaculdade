public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        int vet[] = new int[6];
        int somaPar = 0;
        int qtdImpar = 0;
        System.out.println("Informe 6 numeros");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Numeros pares");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                somaPar += vet[i];
            }
        }
        System.out.println("\nSoma pares: " + somaPar);
        System.out.println("Numeros Impares");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 != 0) {
                System.out.print(vet[i] + " ");
                qtdImpar++;
            }
        }
        System.out.println("\nQuantidade impares: " + qtdImpar);

    }
}