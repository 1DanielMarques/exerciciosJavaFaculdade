public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        double vet[] = new double[5];
        int codigo;
        System.out.println("5 numeros");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextDouble();
        }
        do {
            System.out.println("\ncodigo");
            codigo = sc.nextInt();

            if (codigo == 1) {
                System.out.println("Ordem direta");
                for (int i = 0; i < vet.length; i++) {
                    System.out.print(vet[i] + " | ");
                }
            } else if (codigo == 2) {
                System.out.println("Ordem inversa");
                for (int i = vet.length - 1; i >= 0; i--) {
                    System.out.print(vet[i] + " | ");
                }
            } else if (codigo != 1 && codigo != 2 && codigo != 0) {
                System.out.println("Código inválido");
            }
        } while (codigo != 0);
    }
}
