class Solution {
    public int[][] generateMatrix(int n) {
        int startX =  0;
        int startY = 0;
        int offset = 1;
        int loop = 1;
        int count = 1;
        int i, j;
        int[][] arr = new int[n][n];

        // 一共循环 n/2 次
        while (n / 2 >= loop) {
            for (j = startY; j < n - offset; j++) {
                arr[startX][j] = count;
                count++;
            }

            for (i = startX; i < n - offset; i++) {
                arr[i][j] = count;
                count++;
            }

            for ( ; j > startY; j--) {
                arr[i][j] = count;
                count++;
            }

            for ( ; i > startX; i--) {
                arr[i][j] = count;
                count++;
            }
            // 每次循环后，都需要更改坐标值/圈数等对应的value
            startX++;
            startY++;
            offset++;
            loop++;
        }

        if (n % 2 != 0) {
            arr[startX][startY] = count;
        }

        return arr;
    }
}