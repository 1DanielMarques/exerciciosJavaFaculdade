public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        String nome, sexo, estadoCivil;
        int idade, verificaVez;
        double salario;
        boolean verifica = true;

        verificaVez = 0;
        do {
            if (verificaVez == 1) {
                System.out.println("Nome deve ter mais que três letras");
            }
            System.out.print("Nome: ");
            nome = sc.nextLine();

            verificaVez = 1;
        } while (nome.length() <= 3);

        verificaVez = 0;
        do {
            if (verificaVez == 1) {
                System.out.println("Idade deve ser entre 0 e 150");
            }
            System.out.print("Idade: ");
            idade = sc.nextInt();
            verificaVez = 1;
        } while (idade < 0 || idade > 150);

        verificaVez = 0;
        do {
            if (verificaVez == 1) {
                System.out.println("Salário deve ser maior que 0");
            }
            System.out.print("Salário: ");
            salario = sc.nextDouble();
            verificaVez = 1;
        } while (salario <= 0);

        verificaVez = 0;
        do {
            if (verificaVez == 1) {
                System.out.println("Sexo deve ser f ou m");
            }
            System.out.print("Sexo: ");
            sexo = sc.next();
            verificaVez = 1;
            if (sexo.equals("f") || sexo.equals("m")) {
                verifica = false;
            }
        } while (verifica);

        verificaVez = 0;
        verifica = true;
        do {
            if (verificaVez == 1) {
                System.out.println("Estado Civil deve ser s/c/v/d");
            }
            System.out.print("Estado civil: ");
            estadoCivil = sc.next();
            verificaVez = 1;
            if (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v")
                    || estadoCivil.equals("d")) {
                verifica = false;
            }

        } while (verifica);

        switch (estadoCivil) {
            case "s":
                estadoCivil = "Solteiro(a)";
                break;
            case "c":
                estadoCivil = "Casado(a)";
                break;
            case "v":
                estadoCivil = "Viúvo(a)";
                break;
            case "d":
                estadoCivil = "Casado(a)";
                break;
        }

        System.out.println("-----DADOS-----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo.toUpperCase());
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("------------------");

    }
}
