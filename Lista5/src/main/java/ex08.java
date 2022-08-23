public class ex08 extends AuxScanner {
    public static void main(String[] args) {
        double numero = 0, soma = 0, media = 0, desvio = 0;
        double numeros[] = new double[10];

        System.out.println("Números");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º: ");
            numero = sc.nextDouble();
            numeros[i] = numero;
            soma += numero;
        }
        media = soma / 10;
        System.out.println("Média: " + media);
        soma = 0;
        for (int j = 0; j < 10; j++) {
            numeros[j] -= media;

            numeros[j] = numeros[j] * numeros[j];
            soma += numeros[j];
        }
        desvio = soma / 10;

        System.out.println("Desvio padrão: " + String.format("%.2f", Math.sqrt(desvio)));


    }
}
