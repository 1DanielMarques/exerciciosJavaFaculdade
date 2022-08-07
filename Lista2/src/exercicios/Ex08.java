package exercicios;

public class Ex08 extends AuxScanner {
    public static void main(String[] args) {

        int numero, verifica = 1, aux;
        int lista[] = new int[5];

        System.out.println("Informe cinco números");
        for (int i = 0; i <= 4; i++) {
            numero = sc.nextInt();
            lista[i] = numero;
        }
        
        while (verifica == 1) {
            verifica = 0;
            for (int i = 0; i <= 3; i++) {
                if (lista[i] > lista[i + 1]) {
                    verifica = 1;
                    aux = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = aux;
                }
            }
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(lista[i]);
        }
    }
}
