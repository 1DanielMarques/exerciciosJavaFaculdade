public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        double vetor[] = new double[10];
        double iguais[] = new double[10];
        int cont = 0,indice=0;


        System.out.println("informe 10 valores");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                cont = 0;
                if (vetor[j] == vetor[i] && j != i) {
                    for (int aux = 0; aux < vetor.length; aux++) {
                        if(iguais[aux] == vetor[j]){
                            cont = 1;
                        }
                    }
                    if(cont ==0){
                        iguais[indice] = vetor[i];
                        indice++;
                    }
                }
            }
        }
        for(int i=0;i < iguais.length;i++){
            if(iguais[i] != 0){
                System.out.print(iguais[i]+" | ");
            }
        }

    }
}
