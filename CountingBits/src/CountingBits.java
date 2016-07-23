import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class CountingBits {
    
	public int getCount(int num){
		int i=1;
		for( i=1; i<=num; i++){
			if( Math.pow(2, i) >num )
				return i;
		}
		return 1;
	}
	
	public int countNumberofOne(int[] arr){
		int i = 0;
		for(int j=0; j<arr.length; j++){
			if(arr[j]==1)
				i++;
		}
		return i;
	}
	
	public void addOne(int[] arr){
		int sign=1;
		for(int i=0; i<arr.length; i++){
		    if(arr[i]==1 && sign==1){
		    	arr[i] = 0;
		    	sign = 1;
		    }else{
		    	arr[i] = 1;
		    	break;
		    }
		}
	}
	
	public int[] CountingBits(int num){
		int d = getCount(num);
		int[] output = new int[num+1];
		//System.out.print(d);
		int[] count_bit = new int[d];
		Arrays.fill(count_bit, 0);
//		for(int s: count_bit){
//			System.out.println(s);
//		}
		for(int i=0; i<=num; i++){
			output[i] = countNumberofOne(count_bit);
			addOne(count_bit);
			System.out.println(output[i]);
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CountingBits cb = new CountingBits();
        cb.CountingBits(5);
//        int[] arr = new int[10];
//        Arrays.fill(arr, 0);
//        cb.addOne(arr);
//        for(int i=0; i<arr.length; i++)
//        	System.out.println(arr[i]);
	}

}
