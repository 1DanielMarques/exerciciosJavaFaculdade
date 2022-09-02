package exAula_dia_0109;

public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "] = ");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }


    }
}
