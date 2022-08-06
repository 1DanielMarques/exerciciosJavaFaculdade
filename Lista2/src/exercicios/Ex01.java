package exercicios;

public class Ex01 extends AuxScanner {

    public static void main(String[] args) {

        double A, B, C;

        System.out.println("Informe 3 valores");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if ((A + B) > C) {
            System.out.println("A soma entre A + B é igual a " + (A + B));

        }

    }

}
