package exercicios;

public class Ex09 extends AuxScanner{
    public static void main(String[] args) {
        double altura, peso;
        String sexo;
        System.out.println("Altura: ");
        altura = sc.nextDouble();
        System.out.println("Sexo: F/M");
        sexo = sc.next();

        if (sexo.equals("F")) {
            peso = (62.1 * altura) - 44.7;
        } else {
            peso = (72.7 * altura) - 58;
        }
        System.out.println("Peso ideal: " + String.format("%.2f", peso));

    }

}
