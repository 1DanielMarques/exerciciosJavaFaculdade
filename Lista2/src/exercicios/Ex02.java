package exercicios;

public class Ex02 extends AuxScanner{

    public static void main(String[] args) {
        String nome, sexo, estadoC;
        int anos;

        System.out.println("Informe o nome");
        nome = sc.nextLine();
        System.out.println("Informe o sexo F/M");
        sexo = sc.next();
        System.out.println("Estado Civil");
        estadoC = sc.next();

        if(sexo.equals("F") && estadoC.equals("Casada")){
            System.out.println("Informe quantos anos é casada");
            anos = sc.nextInt();
        }

    }

}
