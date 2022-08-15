public class ex05 extends AuxScanner {

    public static void main(String[] args) {
        int habitantesA, habitantesB;
        double taxaA, taxaB;
        int anos = 0, opcao = 0, verificaA = 0, verificaB = 0;
        do {
            anos = 0;
            System.out.println("1 - Informar dados");
            System.out.println("2 - Finalizar");
            opcao = sc.nextInt();
            if (opcao == 2) {
                break;
            }

            do {
                System.out.print("Quantidade de habitantes de A: ");
                habitantesA = sc.nextInt();
                System.out.print("Taxa de crescimento anual de A: ");
                taxaA = sc.nextDouble();
                if (habitantesA <= 1) {
                    System.out.println("Habitantes deve ser maior que 1");
                } else if (taxaA <= 0) {
                    System.out.println("Taxa deve ser maior que 0");
                } else {
                    verificaA = 1;
                }
            } while (verificaA == 0);
            do {
                System.out.print("\nQuantidade de habitantes de B: ");
                habitantesB = sc.nextInt();
                System.out.print("Taxa de crescimento anual de B: ");
                taxaB = sc.nextDouble();
                if (habitantesB <= 1) {
                    System.out.println("Habitantes deve ser maior que 1");
                } else if (taxaB <= 0) {
                    System.out.println("Taxa deve ser maior que 0");
                } else {
                    verificaB = 1;
                }
            } while (verificaB == 0);
            taxaA = taxaA /  100;
            taxaB = taxaB / 100;
            do {
                habitantesA = (int)(habitantesA + (habitantesA * taxaA));
                habitantesB = (int)(habitantesB + (habitantesB * taxaB));
                anos++;
                if (anos >= 999) {
                    System.out.println("Mais de mil anos ou nunca chegará");
                    break;
                }
            } while (habitantesA < habitantesB);
            if (anos != 999) {
                if (habitantesA == habitantesB) {
                    System.out.println("Habitantes de A:" + habitantesA);
                    System.out.println("Habitantes de B:" + habitantesB);
                    System.out.println("Anos até A igualar B: " + anos);
                } else {
                    System.out.println("Habitantes de A:" + habitantesA);
                    System.out.println("Habitantes de B:" + habitantesB);
                    System.out.println("Anos até A passar B: " + anos);
                }
            }

        } while (opcao != 2);
        System.out.println("---FINALIZADO---");
    }
}
