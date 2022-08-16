
import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class Matriz {

    public static int m1[][], m2[][], m3[][];
    public static int x1, y1, x2, y2, valor;
    public static Scanner sc = new Scanner(System.in);

    public static void informaM1() {
        System.out.println("Valores matriz 1");
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                m1[i][j] = valor;
            }
        }
    }

    public static void escrevaM1() {
        for (int i = 0; i < x1; i++) {
            System.out.println("");
            for (int j = 0; j < y1; j++) {
                System.out.print(m1[i][j]);

            }
        }
    }

    public static void informaM2() {
        System.out.println("\nValores matriz 2");
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                m2[i][j] = valor;
            }
        }
    }

    public static void escrevaM2() {
        for (int i = 0; i < x1; i++) {
            System.out.println("");
            for (int j = 0; j < y1; j++) {
                System.out.print(m2[i][j]);

            }
        }
    }

    public static void informaM3() {
        m3 = new int[x1][y1];
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }

        }
    }

    public static void soma() {
        System.out.print("\n--SOMA--");
        for (int k = 0; k < m3.length; k++) {
            System.out.println("");
            for (int m = 0; m < m3.length; m++) {
                System.out.print(m3[k][m]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Matriz X: ");
        x1 = sc.nextInt();
        System.out.print("Matriz Y: ");
        y1 = sc.nextInt();
        m1 = new int[x1][y1];
        m2 = new int[x1][y1];
        informaM1();
        System.out.print("----");
        informaM2();
        System.out.print("Matriz 1");
        escrevaM1();
        System.out.print("\nMatriz 2");
        escrevaM2();
        informaM3();
        //soma();

        // Multiplicacao das matrizes
        for (int linha = 0; linha < x1; linha++) {
            for (int coluna = 0; coluna < y1; coluna++) {
                m3[x1][y1] = m1[x1][y1] * m2[y1][x1];
            }
        }

    }
}
