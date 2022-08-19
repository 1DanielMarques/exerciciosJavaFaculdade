public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        double numero = 1, media, soma = 0;
        int c = 0;
        System.out.println("Informe um número");
        while (numero != 0) {
            numero = sc.nextDouble();
            soma += numero;
            if (numero == 0) {
                System.out.println("Qnt. Números: " + c);
                media = soma / c;
                System.out.println("Média: " + media);
                break;
            }
            c++;
        }
    }
}
