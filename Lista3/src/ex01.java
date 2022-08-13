public class ex01 extends AuxScanner {
   public static void main(String[] args) {
      int numero = 0, i = 0;
      System.out.println("Informe uma nota entre 0 e 10");
      do {
         if (i == 1) {
            System.out.println("Número inválido, informe novamente");
         }
         numero = sc.nextInt();
         i = 1;
      } while (numero < 0 || numero > 10);

   }
}
