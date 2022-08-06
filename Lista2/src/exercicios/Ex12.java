package exercicios;

public class Ex12 extends AuxScanner {

    public static void main(String[] args) {
        double n1, n2, n3, media, me;
        String tipo, id;
        boolean situacao = true;

        System.out.println("Informe o número de identificação");
        id = sc.next();

        System.out.println("Informe as 3 notas");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        System.out.println("Informe a média dos exercícios");
        me = sc.nextDouble();

        // MA:= ((nota1 + nota 2 )* 2 +( nota 3) * 3 + (ME)) /7
        media = ((n1 + n2) * 2 + (n3) * 3 + (me)) / 7;

        if (media >= 90) {
            tipo = "A";
        } else if (media >= 75 && media < 90) {
            tipo = "B";
        } else if (media >= 60 && media < 75) {
            tipo = "C";
        } else if (media >= 40 && media < 60) {
            tipo = "D";
            situacao = false;
        } else {
            tipo = "E";
            situacao = false;
        }
        System.out.println("Identificação: " + id);
        System.out.println("Nota 1: " + String.format("%.2f", n1) + "\nNota 2: " + String.format("%.2f", n2)
                + "\nNota 3: " + String.format("%.2f", n3));
        System.out.println("Média dos exercícios: " + me);
        System.out.println("Média de Aproveitamento: " + String.format("%.2f", media) + " | Conceito: " + tipo);
        if (situacao) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

    }

}
