/**
 * CORRIGIDO: OK
 *
 * @author Daniel Marques
 */

public class ex02 {
    public static void main(String[] args) {

        double porcentagem = 0;
        double salario = 1000;

        porcentagem = (1.5 / 100);
        salario = salario + (salario * porcentagem);

        for (int i = 1; i <= 25; i++) {
            porcentagem = porcentagem * 2;
            salario = salario + (salario * porcentagem);
        }
        System.out.println("Salário atual: R$" + salario);
    }
}
