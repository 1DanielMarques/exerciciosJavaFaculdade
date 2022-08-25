public class ex06 extends AuxScanner {
    public static void main(String[] args) {
        double numero, diferenca = 0, auxDiferenca = 0, aux = 0;
        boolean verifica = true;
        System.out.print("Informe um número: ");
        numero = sc.nextDouble();
        aux = numero;
        for (int i = 0; i < 8; i++) {
            System.out.print("Informe um número: ");
            numero = sc.nextDouble();
            // 2 4 6 8 10
            diferenca = aux - numero;
            aux = numero;
            if (i == 0) {
                auxDiferenca = diferenca;
            }
            if (auxDiferenca != diferenca) {
                verifica = false;
                break;
            }

        }
        if (verifica) {
            System.out.println("É Progressão Aritmética");
        } else {
            System.out.println("Não é Progressão Aritmética");
        }

    }
}
