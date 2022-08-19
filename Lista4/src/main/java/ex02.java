public class ex02 extends AuxScanner {
    public static void main(String[] args) {
        Integer senha;
        System.out.print("Informe a senha: ");
        senha = sc.nextInt();
        if(senha.toString(senha).length() == 4){
            System.out.println("Senha Correta");
        }else{
            System.out.println("Senha Incorreta");
        }
    }
}
