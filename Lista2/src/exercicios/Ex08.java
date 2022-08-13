package exercicios;

public class Ex08 extends AuxScanner {
    public static void main(String[] args) {

        int numero, verifica = 1, aux, c = 1, igual = 0;
        int lista[] = new int[5];

        System.out.println("Informe 5 números");

        System.out.println("Insira 5 números diferentes");

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
        System.out.println("-----ORDEM CRESCENTE-----");
        for (int i = 0; i <= 4; i++) {
            System.out.print(lista[i] + " | ");
        }
        System.out.println("\n-------------------------");
    }
}
