public class ex04 extends AuxScanner{
    public static void main(String[] args) {
        double e1 = 0, r = 0, limite = 0;
        System.out.print("Informe o primeiro elemento: ");
        e1 = sc.nextDouble();
        System.out.print("Informe a razão: ");
        r = sc.nextDouble();
        System.out.print("Informe o limite: ");
        limite = sc.nextDouble();

        System.out.print(e1 + " | ");
        for (int i = 0; i < limite - 1; i++) {
            e1 = e1 * r;
            System.out.print(e1 + " | ");
        }


    }
}
