package exercicios;

public class Ex04 extends AuxScanner{

    public static void main(String[] args) {

        int a, b, c = 0;

        System.out.println("Informe dois números inteiros");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("Resultado: " + c);
        
    }

}
