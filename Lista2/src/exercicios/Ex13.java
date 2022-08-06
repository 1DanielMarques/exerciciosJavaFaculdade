package exercicios;

public class Ex13 extends AuxScanner {
    public static void main(String[] args) {

        int lado;
        double area, medida, altura;
        System.out.println("Quantos lados tem?");
        lado = sc.nextInt();
        System.out.println("Informe em CM a medida do lado");
        medida = sc.nextDouble();

        switch (lado) {
            case 3:
                // altura = Math.sqrt((Math.pow(medida, 2) - Math.pow((medida / 2), 2)));
                // Considerando raiz de 3 como 1.7
                altura = (medida * 1.7) / 2;
                area = medida * altura / 2;
                System.out.println("TRIÂNGULO");
                System.out.println("Aréa: " + String.format("%.2f", area) + "cm²");
                break;
            case 4:
                System.out.println("QUADRADO");
                area = medida * medida;
                System.out.println("Área: " + String.format("%.2f", area) + "cm²");

                break;

            case 5:
                System.out.println("PENTÁGONO");
                break;
        }

    }
}
