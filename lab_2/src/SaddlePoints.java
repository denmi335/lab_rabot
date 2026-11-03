public class SaddlePoints {

    public static int countSaddlePoints(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] minInRow = new int[rows];
        for (int i = 0; i < rows; i++) {
            minInRow[i] = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minInRow[i]) {
                    minInRow[i] = matrix[i][j];
                }
            }
        }

        int[] maxInCol = new int[cols];
        for (int j = 0; j < cols; j++) {
            maxInCol[j] = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] > maxInCol[j]) {
                    maxInCol[j] = matrix[i][j];
                }
            }
        }

        int saddlePoints = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == minInRow[i] && matrix[i][j] == maxInCol[j]) {
                    saddlePoints++;
                }
            }
        }

        return saddlePoints;
    }
}