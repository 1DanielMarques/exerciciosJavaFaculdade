package exercicios;

public class Ex05 extends AuxScanner{

    public static void main(String[] args) {
        int numero;

        System.out.println("Informe um número");
        numero = sc.nextInt();
        if (numero > 0) {
            numero *= 2;
        } else if (numero < 0) {
            numero *= 3;
        }
        System.out.println("Resultado: " + numero);
    }

}
