package com.stark._1_100._61_70;

/**
 * Created by Stark on 2017/9/17.
 * 假设有一个排序的按未知的旋转轴旋转的数组(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。给定一个目标值进行搜索，如果在数组中找到目标值返回数组中的索引位置，否则返回-1。
 * 你可以假设数组中不存在重复的元素。
 */
public class LintCode_62 {
    public int search(int[] A, int target) {
        // write your code here
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[mid] < A[right]) {//右边上升序列
                if (target < A[mid] || target > A[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (A[mid] > A[left]) {
                if (target >= A[left] && target < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LintCode_62 lintCode_62 = new LintCode_62();
        System.out.println(lintCode_62.search(new int[]{4, 5, 1, 2, 3}, 5));
    }

}
