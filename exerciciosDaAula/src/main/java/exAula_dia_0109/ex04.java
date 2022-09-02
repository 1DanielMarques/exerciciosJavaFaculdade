package exAula_dia_0109;

public class ex04 extends AuxScanner {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / 5));
        for (int j = 0; j < vetor.length; j++) {
            if(vetor[j] > (soma/5)){
                System.out.println("Maior: " + vetor[j]);
            }else if(vetor[j] < (soma/5)){
                System.out.println("Menor: " + vetor[j]);
            }


        }


    }
}
