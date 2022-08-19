public class ex06 extends AuxScanner {
    public static void main(String[] args) {
        int idade = 0, menor = 0, maior = 0, qntF = 0, qtdP = 0;
        int idadeS = 0;
        String sexo, sexoS = "";
        double salario, soma = 0, maiorS = 0, menorS = 0;

        do {
            System.out.print("Idade: ");
            idade = sc.nextInt();
            if (idade < 0) {
                break;
            }
            if (idade > maior) {
                menor = maior;
                maior = idade;
            } else if (idade < maior) {
                menor = idade;
            }
            System.out.print("Sexo M/F: ");
            sexo = sc.next();
            if (sexo.equals("F")) {
                qntF++;
            }
            System.out.print("Salário: R$");
            salario = sc.nextDouble();
            qtdP++;
            if (qtdP == 1) {
                menorS = salario;
            }
            if (salario < menorS) {
                menorS = salario;
                idadeS = idade;
                sexoS = sexo;
            }
            soma += salario;
        } while (idade >= 0);
        System.out.println("Média salários: R$" + soma / qtdP);
        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
        System.out.println("Qnt. Mulheres: " + qntF);
        System.out.println("--Pessoa com menor salário--");
        if(idade==0 && sexoS.equals("")){
            System.out.println("Salários iguais");
        }else {
            System.out.println("Salário: R$ " + menorS);
            System.out.println("Idade: " + idadeS);
            System.out.println("Sexo: " + sexoS);
        }

    }
}
