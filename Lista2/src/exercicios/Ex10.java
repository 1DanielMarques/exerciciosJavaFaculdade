package exercicios;

public class Ex10 extends AuxScanner{
    public static void main(String[] args) {

        double l1, l2, l3;
        String tipo;

        System.out.println("Informe os três lados do triângulo: ");
        l1 = sc.nextDouble();
        l2 = sc.nextDouble();
        l3 = sc.nextDouble();
        if (!(l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2)) {
            throw new RuntimeException("Não é um triângulo");
        }

        if (l1 == l2 && l2 == l3) {
            tipo = "Equilátero";
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }

        System.out.println("Tipo: " + tipo);

    }

}
