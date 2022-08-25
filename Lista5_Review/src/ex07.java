public class ex07 extends AuxScanner {
    public static void main(String[] args) {
        double numero = 0, numero2 = 0;
        double resultado = 0, numeroAux = 0;
        String operador, opcao = "", limpar = "";
        do {
            System.out.println("CALCULADORA");
            System.out.print("  1 ");
            System.out.print("2 ");
            System.out.println("3");
            System.out.print("  4 ");
            System.out.print("5 ");
            System.out.println("6");
            System.out.print("  7 ");
            System.out.print("8 ");
            System.out.println("9");
            System.out.println("    0");
            if (numero == 0) {
                System.out.print("Informe um número: ");
                numero = sc.nextDouble();
                numeroAux = numero;
            }

            System.out.println("Conta: " + numeroAux);
            System.out.print("[+] [-] [*] [/] ");
            operador = sc.next();
            System.out.println("Conta: " + numeroAux + " " + operador);
            System.out.print("Informe um número: ");
            numero2 = sc.nextDouble();
            switch (operador) {
                case "+":
                    resultado = numeroAux + numero2;
                    break;
                case "-":
                    resultado = numeroAux - numero2;
                    break;
                case "*":
                    resultado = numeroAux * numero2;
                    break;
                case "/":
                    resultado = numeroAux / numero2;
                    break;
            }
            System.out.println("Conta: " + numeroAux + " " + operador + " " + numero2 + " = " + resultado);
            numeroAux = resultado;

            System.out.println("L - Limpar calculadora");
            System.out.println("C - Continuar Conta");
            System.out.println("P - Parar");
            opcao = sc.next();
            opcao.toLowerCase();
            if (opcao.equals("l")) {
                numero = 0;
            }
        } while (!opcao.equals("p"));

    }
}
