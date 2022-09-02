package exAula_dia_0109;

public class ex02 extends AuxScanner {
    public static void main(String[] args) {
        int v1[] = new int[3];
        int v2[] = new int[3];
        int v3[] = new int[3];
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Vetor 1: ");
            v1[i] = sc.nextInt();
            System.out.print("Vetor 2: ");
            v2[i] = sc.nextInt();
            v3[i] = v1[i] - v2[i];
        }

        for (int j = 0; j < v3.length; j++) {
            if (v3[j] % 2 != 0) {
                System.out.println("Vetor[" + j + "] = " + v3[j]);
            }
        }
    }


}
