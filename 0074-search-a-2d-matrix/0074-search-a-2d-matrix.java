class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int row = -1;

        // Find the correct row
        while (left <= right) {
            int mid = (left + right) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length - 1]) {
                row = mid;
                break;
            } else if (target < matrix[mid][0]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (row == -1) return false;

        // Binary search in the row
        left = 0;
        right = matrix[row].length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return false;
    }
}