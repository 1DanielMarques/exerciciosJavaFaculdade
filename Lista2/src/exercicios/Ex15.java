package exercicios;

public class Ex15 extends AuxScanner {
    public static void main(String[] args) {
        int angulo;
        int listaAngulos[] = new int[3];
        String tipo = "";
        System.out.println("Informe três ângulos");
        for (int i = 0; i <= 2; i++) {
            angulo = sc.nextInt();
            listaAngulos[i] = angulo;
        }
        for (int j = 0; j <= 2; j++) {

            if (listaAngulos[j] > 90) {
                tipo = "Obtusângulo";
                break;
            } else if (listaAngulos[j] == 90) {
                tipo = "Retângulo";
                break;
            } else {
                tipo = "Acutângulo";
            }
        }
        System.out.println("Triângulo " + tipo);
    }
}
