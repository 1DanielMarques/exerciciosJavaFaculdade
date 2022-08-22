public class ex06 extends AuxScanner {
    public static void main(String[] args) {
        int sequencia[] = new int[9];
        int aux = 0, aux2 = 0;
        boolean verifica = false;
        for (int i = 0; i < sequencia.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            sequencia[i] = sc.nextInt();
        }

        for (int j = 0; j < sequencia.length-1; j++) {
            aux = sequencia[j] - sequencia[j + 1];
            if (j == 0) {
                aux2 = aux;
            }
            if (aux2 == aux) {
                verifica = true;
            } else {
                verifica = false;
                break;
            }
        }
        if(verifica == false){
            System.out.println("Não é uma progressão aritmética");
        }else{
            System.out.println("É uma progressão aritmética");
        }

    }
}
