class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;


            for(int i =0;i<r;i++){
           int left = 0;
             int right = c-1;

             while(left<=right){
                int mid = left+(right-left)/2;

                if(matrix[i][mid]==target) return true;

                else if(matrix[i][mid]<=target) left= mid+1;

                else{
                    right = mid-1;
                }
             }


    }
return false;
    }
}

