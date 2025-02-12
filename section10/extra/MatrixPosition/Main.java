package section10.extra.MatrixPosition;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o número de linhas da matriz: ");
        int m = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Informe o valor a ser encontrado na matriz: ");
        int x = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}
