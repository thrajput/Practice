/**
 * Created by Tarun on 7/24/2017.
 *
 * https://leetcode.com/problems/rotate-array/#/description
 *
 *
 */
public class RotateArray {


    public void rotate(int[] nums, int k) {
        k=(k%nums.length);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);

    }

    void reverse(int[] nums, int i, int j)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }



}
