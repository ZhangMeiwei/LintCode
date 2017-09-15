package com.stark._1_100._31_40;

/**
 * Created by Stark on 2017/9/8.
 * 给出一个整数数组 nums 和一个整数 k。划分数组（即移动数组 nums 中的元素），使得：
 * 所有小于k的元素移到左边
 * 所有大于等于k的元素移到右边
 * 返回数组划分的位置，即数组中第一个位置 i，满足 nums[i] 大于等于 k。
 */
public class LintCode_31 {
    public int partitionArray(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        int temp;
        int left=0;
        int right = nums.length-1;
        while(right>left){
            if(nums[left]>=k){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }else {
                left++;
            }
        }
        return nums[left]>=k?left:left+1;
    }

    public static void main(String[] args) {
        System.out.println(new LintCode_31().partitionArray(new int[]{3,2,2,1},3));
    }
}
