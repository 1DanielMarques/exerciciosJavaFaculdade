public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        int n, elemento, anterior = 1, aAnterior = 0, atual = 0;
        System.out.println("---FIBONACCI---");
        System.out.println("Informe um número");
        n = sc.nextInt();

        System.out.println("1");
        for (int i = 1; i < n; i++) {
            atual = aAnterior + anterior;
            aAnterior = anterior;
            anterior = atual;
            System.out.println(atual);

        }


    }
}
