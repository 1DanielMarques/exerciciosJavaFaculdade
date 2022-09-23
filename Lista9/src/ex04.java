import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[][] alunos = new int[3][4];
        int maior = 0;
        int matMaior = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("-Aluno(a) #" + (i + 1) + "-");
            for (int j = 0; j < alunos[i].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Matricula aluno: ");
                        alunos[i][j] = sc.nextInt();
                        break;
                    case 1:
                        System.out.println("Média provas: ");
                        alunos[i][j] = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Média trabalhos: ");
                        alunos[i][j] = sc.nextInt();
                        break;
                    case 3:
                        alunos[i][j] = alunos[i][1] + alunos[i][2];
                        break;
                }
            }
        }
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos[i].length; j++) {
                System.out.print(alunos[i][j] + " | ");
            }
            System.out.println();
        }
        maior = alunos[0][3];
        matMaior = alunos[0][0];
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i][3] > maior) {
                maior = alunos[i][3];
                matMaior = alunos[i][0];
            }
        }
        System.out.println("Matrícula maior nota final: " + matMaior);

        sc.close();
    }
}
