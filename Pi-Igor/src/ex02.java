/**
 * @author Daniel Marques
 */
public class ex02 {
    public static void main(String[] args) {

        double porcentagem = 0;
        double salario = 1000;
        double vet[] = new double[25];

        porcentagem = (1.5 / 100);
        salario = salario + (salario * porcentagem);
        for (int i = 0; i < vet.length; i++) {
            porcentagem = porcentagem * 2;
            salario = salario + (salario * porcentagem);
            vet[i] = salario;
        }
        System.out.println("Salário atual: R$" + vet[24]);
    }
}
