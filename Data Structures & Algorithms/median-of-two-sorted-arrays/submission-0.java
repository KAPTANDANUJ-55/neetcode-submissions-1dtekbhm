// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//          int[] mer=mergeArrays(nums1,nums2);

//          int len = mer.length;

//          if(len%2==0){
//             return (mer[len/2-1]+mer[len/2])/2.0;
//          }
//          else{
//            return mer[len/2];
//          }

//     }

//       public int[] mergeArrays(int[] nums1, int[] nums2) {
//        int n = nums1.length;
//         int m = nums2.length;
//         int[] marr = new int[m+n];
//         int i=0,j=0;
//         int k=0;

//         while(i<n&& j<m){
//             if(nums1[i]<nums2[j]){
//                 marr[k]=nums1[i];
//                 k++;
//                 i++;
//             }
//             else{
//                 marr[k]=nums2[j];
//                 k++;
//                 j++;
//             }
   
//         }

//         while(i<n){
//             marr[k]=nums1[i];
//             i++;
//             k++;
//         }

//         while(j<m){
//             marr[k]= nums2[j];

//             j++;
//             k++;
//         }

//         return marr;
//       }
// }


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        int half = (total + 1) / 2;

        int low = 0, high = m;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = half - i;

            int left1, right1, left2, right2;

            if (i > 0) left1 = nums1[i - 1];
            else left1 = Integer.MIN_VALUE;

            if (i < m) right1 = nums1[i];
            else right1 = Integer.MAX_VALUE;

            if (j > 0) left2 = nums2[j - 1];
            else left2 = Integer.MIN_VALUE;

            if (j < n) right2 = nums2[j];
            else right2 = Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1) {
                if (total % 2 == 1) {
                    return Math.max(left1, left2);
                } else {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }
            } else if (left1 > right2) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

       
        return 0.0;
    }
}