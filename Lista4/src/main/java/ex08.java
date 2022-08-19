public class ex08 extends AuxScanner {
    public static void main(String[] args) {
        int numero, fat = 0;
        System.out.println("Informe um número: ");
        numero = sc.nextInt();
        for (int i = numero - 1; i >= 1; i--) {
            System.out.println(numero + " X " + i + " = " + (numero*i));
            fat = numero * i;
            numero = fat;
        }
        System.out.println("Resultado: " + fat);


    }
}
