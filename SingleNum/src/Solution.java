import java.util.*;
import java.util.Collections.*;
import java.util.Collections;
import java.util.Arrays;
public class Solution {

	public int singleNumber(int[] nums){
		int result=0;
		for(int i=0; i<nums.length; i++){
			result = result^nums[i];
		}
		return result;
	}
	
	public int singleNumber2(int[] nums){
		Set<Integer> a = new HashSet<Integer>();
		int sum2 = 0;
		for(int i=0; i<nums.length; i++){
			a.add( nums[i]);
			sum2 += nums[i];
		}
		Iterator<Integer> it = a.iterator();
		int sum = 0;
		while(it.hasNext() ){
			sum += 2*it.next();
		}
				
		return sum-sum2;
	}
	
	public int singleNumber3(int[] nums){
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i= i+2)
			if(nums[i]!=nums[i+1])
				return nums[i];
		return nums[ nums.length-1];
		
	}
	
	public static void main(String[] args){
		Solution s = new Solution();
	    int[] nums = {0,0,1,1,2,2,3,3,4};
	    System.out.println( s.singleNumber3(nums) );
	}
}
