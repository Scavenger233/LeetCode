class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int mid = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if ((long)mid * mid > x) {
                right = mid - 1;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return right;
    }
}