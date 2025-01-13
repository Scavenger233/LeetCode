class Solution {
    public int[][] generateMatrix(int n) {
        int startX = 0; 
        int startY = 0;
        int offset = 1;
        int count = 1;
        int loop = 1;
        int i, j;
        int[][] arr = new int[n][n];

        // 当圈数为1（基数）或者0（偶数）的时候停止while循环
        while (loop <= n / 2) {
            // 上边
            for (j = startY; j < n - offset; j++) {
                // 这时候给整行赋值，i全程取startX， j用for循环逐个赋值
                arr[startX][j] = count;
                count++;
            }

            // 右边
            for (i = startX; i < n - offset; i++) {
                arr[i][j] = count;
                count++;
            }

            // 下边
            // 此时坐标在右下角，j是最大值，不用初始化
            for ( ; j > startY; j--) {
                arr[i][j] = count;
                count++;
            }

            // 左边
            // 此时坐标在左下角，i时最大值，不用初始化
            for ( ; i > startX; i--) {
                arr[i][j] = count;
                count++;
            }

            // 每遍历一圈，初始坐标值要分别+1
            startX++;
            startY++;
            // 每遍历一圈，offset要-1，去掉已经计算过的外围数值
            offset++;
            // 每遍历一圈，圈数加一，直到遍历了所有的圈跳出while loop
            loop++;
        }

        // 当圈数是奇数时，中心值就是最后一个数字，坐标是最后的[startX][startY]
        if (n % 2 != 0) {
            arr[startX][startY] = count;
        }

        return arr;
        
    }
}