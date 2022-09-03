public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        double vetor[] = new double[10];
        double soma = 0;
        int qtd = 0;
        System.out.println("Informe 10 numeros reais");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
            if (vetor[i] < 0) {
                qtd++;
            } else if (vetor[i] > 0) {
                soma += vetor[i];

            }
        }
        System.out.println("Quantidade negativos: " + qtd);
        System.out.println("Soma positivos: " + soma);



    }
}
