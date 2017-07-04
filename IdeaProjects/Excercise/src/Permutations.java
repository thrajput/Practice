import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tarun on 7/4/2017.
 *
 *https://leetcode.com/problems/permutations-ii/#/description
*/
public class Permutations {

    void recursion(List<Integer> nums,int i,int j,List<List<Integer>> result)
    {
        if(i==j-1)
        {
            result.add(nums);
            return;
        }
        for(int k=i;k<j;k++)
        {
            if(i!=k && nums.get(i)==nums.get(k)) continue;
            Integer tmp=nums.get(k);
            nums.set(k,nums.get(i));
            nums.set(i,tmp);
            recursion(new ArrayList<>(nums),i+1,j,result);
        }

    }



    public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            List<Integer>  input = new ArrayList<Integer>();

            for(int i=0;i<nums.length;i++)
            {
                input.add(nums[i]);
            }
            List<List<Integer>> sum = new ArrayList<>();
            recursion(input,0,nums.length,sum);
            return sum;
        }

    public static void main(String[] args)
    {
            Permutations p =new Permutations();
            int[] a={1,1,2};
            List<List<Integer>> result= p.permuteUnique(a);
            return;

    }
}
