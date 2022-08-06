package exercicios;

public class Ex11 extends AuxScanner {

    public static void main(String[] args) {
        int opcao;
        double preco, valor, aux = 0;

        System.out.println("Valor do produto");
        valor = sc.nextDouble();

        System.out.println("\n1 - À vista em dinheiro ou cheque, 10% desconto");
        System.out.println("2 - À vista no cartão de crédito, 15% desconto");
        System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4 - Em duas vezes, preço normal de etiqueta mais 10% juros");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                aux = valor * 0.1;
                valor -= aux;
                break;
            case 2:
                aux = valor * 0.15;
                valor -= aux;
                break;
            // case 3:
            // break;
            case 4:
                aux = valor * 0.1;
                valor += aux;
                break;
        }

        System.out.println("Valor a ser pago: R$" + valor);
    }

}
