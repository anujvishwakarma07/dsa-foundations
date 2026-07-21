public class SearchIn2DMatrix74 {
    public static boolean searchInRow(int matrix[][], int target, int row) {
        int n = matrix[row].length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid  = st + (end - st)/ 2;
            if(target < matrix[row][mid]) {
                end = mid - 1;
            } else if (target > matrix[row][mid]) {
                st = mid + 1;
            } else if (target == matrix[row][mid]) {
                return true;
            }
        }
        return false;
    }
    public static boolean searchInTwoDmatrix(int matrix[][], int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0;
        int endRow = m - 1;

        while(startRow <= endRow) {
            int midRow = startRow + (endRow - startRow)/ 2;
            if(target < matrix[midRow][0]) {
                endRow = midRow - 1;
            } else if (target > matrix[midRow][n - 1]) {
                startRow = midRow + 1;
            } else if (target >= matrix[midRow][0] && target <= matrix[midRow][n - 1]){
                return searchInRow(matrix, target, midRow);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int matrix[][] = { { 1, 3, 5, 7 }};
        int target = 3;
        System.out.println(searchInTwoDmatrix(matrix, target));
    }
}
