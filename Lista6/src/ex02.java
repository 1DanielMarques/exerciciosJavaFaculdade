public class ex02 extends AuxScanner {
    public static void main(String[] args) {
        int vet[] = new int[5];
        int maior, menor;
        double soma;
        System.out.println("Informe 5 valores inteiros");
        vet[0] = sc.nextInt();
        soma = vet[0];
        maior = vet[0];
        menor = vet[0];
        // 3 5 2 6 1
        for (int i = 1; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = vet[i];
            } else if (vet[i] < menor) {
                menor = vet[i];
            }
            soma += vet[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " +(soma/5));


    }
}
