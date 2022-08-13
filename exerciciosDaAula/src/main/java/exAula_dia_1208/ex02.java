package exAula_dia_1208;

import java.util.Random;

public class ex02 extends AuxScanner {
    public static void main(String[] args) {
        Random rnd = new Random(); // Inicia Aleatório
        int x = rnd.nextInt(100);// Gera um número aleatorio (0-99)
        System.out.println("Número sorteado: " + x);
        int numero = 0;
        do {
            System.out.println("Chute um número");
            numero = sc.nextInt();
            if (numero > x)
                System.out.println("MAIOR");
            else if (numero < x)
                System.out.println("MENOR");
        } while (x != numero);
        System.out.println("Acertou!");

    }
}
