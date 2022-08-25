public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        int aAnterior = 0, anterior = 1, atual = 0, numero = 0;
        System.out.print("Informe um número: ");
        numero = sc.nextInt();
        System.out.print(" | "+anterior + " | ");
        for (int i = 0; i < numero-1; i++) {
            atual = aAnterior + anterior;
            aAnterior = anterior;
            anterior = atual;
            System.out.print(atual + " | ");

        }


    }
}
