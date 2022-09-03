public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        double vetor[] = new double[5];
        double iguais[] = new double[5];


        int verifica = 0;
        System.out.println("informe 10 valores");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0; i < vetor.length; i++) {
            verifica = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j] && j != i) {
                    System.out.print(vetor[i] + " ");
                    vetor[i] = 435645691;
                }
            }
        }


    }
}
/*
       Professor disse que não importa a quantidade de vezes que
       imprime o número repetido, contanto que mostre qual número é
        */