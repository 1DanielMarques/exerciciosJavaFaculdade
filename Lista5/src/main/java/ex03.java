public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        int a1, r, n;
        System.out.println("Informe o primeiro elemento");
        a1 = sc.nextInt();
        System.out.println("Informe a razão");
        r = sc.nextInt();
        if (r == 0) {
            throw new RuntimeException("Não pode ser 0");
        }
        System.out.println("Informe um número");
        n = sc.nextInt();
        System.out.println(a1);
        for (int i = 1; i < n; i++) {
            a1 = a1 + r;
            System.out.println(a1);
        }


    }
}
