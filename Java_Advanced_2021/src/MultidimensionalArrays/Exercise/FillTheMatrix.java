package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String fillPattern = tokens[1];

        int[][] matrix = fillMatrix(n, fillPattern);
        printMatrix(matrix);

    }

    private static int[][] fillMatrix(int n, String pattern) {
        int[][] matrix = new int[n][n];
        if ("A".equals(pattern)) {
            fillPatternA(matrix);
        } else if ("B".equals(pattern)){
            fillPatternB(matrix);
        }
        return matrix;
    }

    private static void fillPatternB(int[][] matrix) {
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = number++;
                }
            }else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[j][i] = number++;
                }
            }
        }
    }

    private static void fillPatternA (int[][] matrix){
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = number++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.printf("%d ", el);
            }
            System.out.println();
        }
    }
}