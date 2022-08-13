import javax.sound.midi.Soundbank;

public class ex02 extends AuxScanner {

    public static void main(String[] args) {
        String nome, senha;
        int i=0;
        System.out.println("Informe nome");
        nome = sc.nextLine();
        System.out.println("Informe senha");
        do {
            if(i==1){
                System.out.println("Senha igual, informe novamente");
            }
            senha = sc.next();
            i = 1;
        } while (senha.equals(nome));

    }

}
