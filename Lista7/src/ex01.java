/**
 * @author Daniel Marques
 */
public class ex01 extends AuxScanner {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
        System.out.println("Vetor A");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Vetor B");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - (b[i] * a[i]);
        }
        System.out.println("Vetor C");
        for (int i = 0; i < b.length; i++) {
            System.out.print(c[i] + " ");
        }


    }

}
