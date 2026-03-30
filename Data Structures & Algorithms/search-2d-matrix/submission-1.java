class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int row = 0;
        int col = c-1;

        while(row<r && col>=0){
            int mid = row + (col-row)/2;

            if(matrix[row][col]== target) return true;
            else if(matrix[row][col]<target) row++;
            else col--;
        }

    //         for(int i =0;i<r;i++){
    //        int left = 0;
    //          int right = c-1;

    //          while(left<=right){
    //             int mid = left+(right-left)/2;

    //             if(matrix[i][mid]==target) return true;

    //             else if(matrix[i][mid]<=target) left= mid+1;

    //             else{
    //                 right = mid-1;
    //             }
    //          }


    // }
return false;
    }
}

