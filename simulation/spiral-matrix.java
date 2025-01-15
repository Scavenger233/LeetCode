class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowTop = 0;
        int rowBottom = matrix.length - 1;
        int colLeft = 0;
        int colRight = matrix[0].length - 1;
        int i, j;

        List<Integer> list = new ArrayList<>();

        while (rowTop <= rowBottom && colLeft <= colRight) {
            // Top
            for (j = colLeft; j <= colRight; j++) {
                list.add(matrix[rowTop][j]);
            }
            rowTop++;

            // Right
            for (i = rowTop; i <= rowBottom; i++) {
                list.add(matrix[i][colRight]);
            }
            colRight--;

            // Bottom
            // Before loop start check if the loop is finished yet
            if (rowTop <= rowBottom) {
                for (j = colRight; j >= colLeft; j--) {
                    list.add(matrix[rowBottom][j]);
                }
                rowBottom--;
            }

            // Left
            // Before loop start check if the loop is finished yet
            if (colLeft <= colRight) {
                for (i = rowBottom; i >= rowTop; i--) {
                    list.add(matrix[i][colLeft]);
                }
                colLeft++;
            }
        }

        return list;
    }
}