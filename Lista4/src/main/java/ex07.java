public class ex07 extends AuxScanner {
    public static void main(String[] args) {
        int soma = 0;
        int qtdTurmas;
        int turmas[];
        int alunos;
        System.out.print("Qtd. Turmas: ");
        qtdTurmas = sc.nextInt();
        turmas = new int[qtdTurmas];

        for (int i = 0; i < turmas.length; i++) {
            System.out.print("Qtd. Alunos turma " + (i+1)+ ": ");
            alunos = sc.nextInt();
            soma += alunos;
            if (alunos > 40) {
                i -= 1;
                System.out.println("Não pode ter mais de 40 alunos");
                System.out.println("Informe novamente");
            }
            turmas[i] = alunos;
        }

        for (int j = 0; j < turmas.length; j++) {
            System.out.println("Turma " + (j+1)+": " + turmas[j] + " alunos");
        }
        System.out.println("Média alunos p/ turma: " + (soma/qtdTurmas));

    }
}
