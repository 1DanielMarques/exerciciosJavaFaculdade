public class ex10 extends AuxScanner {
    public static void main(String[] args) {
        int n1, n2;
        System.out.println("Informe dois números");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int i = n1+1; i < n2; i++){
            System.out.print(i + " ");
        }

    }
}
