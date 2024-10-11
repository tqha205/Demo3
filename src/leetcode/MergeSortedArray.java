package leetcode;

import com.sun.scenario.effect.Merge;

public class MergeSortedArray {
    //Ví dụ 1:
//
//Đầu vào: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Đầu ra: [1,2,2,3,5,6]
// Giải thích: Các mảng chúng ta đang hợp nhất là [1,2,3] và [2,5,6].
//Kết quả của việc hợp nhất là [ 1 , 2 ,2, 3 ,5,6] với các phần tử được gạch chân đến từ nums1.
    public static void Merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
    }



//    private static void Merge() {
//    }

}

