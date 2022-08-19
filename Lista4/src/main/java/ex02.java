public class ex02 extends AuxScanner {
    public static void main(String[] args) {
        String senha;
        int verifica = 0;

        do {
            System.out.print("Informe a senha: ");
            senha = sc.next();

            if (verificaSenha(senha) && senha.length() == 4) {
                System.out.println("Senha Correta");
                verifica = 1;
            } else {
                System.out.println("Senha Incorreta");
            }
        } while (verifica != 1);

    }

    public static boolean verificaSenha(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            if (!Character.isDigit(senha.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
