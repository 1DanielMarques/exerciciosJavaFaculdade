public class ex04 extends AuxScanner {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        boolean verifica;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            verifica = true;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j] && i!=j) {
                    verifica = false;
                    break;
                }
            }
            if(verifica){
                System.out.print(vetor[i] + " | ");
            }
        }

    }
}
