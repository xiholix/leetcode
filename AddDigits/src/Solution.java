import java.util.*;

public class Solution {
	
	public int addDigit(int num){
		int sum = 0;
		while(num!=0){
			sum += num%10;
			num = num/10;
		}
		return sum;
	}
	
	
    public int addDigits(int num){
    	while(num>=10){
    		num = addDigit(num);
    	}
    	return num;
    }
    
    public int addDigits2(int num){
    	int sum=0;
    	while(num!=0){
    		sum += num%10;
    		num /= 10;
    		if( sum>=10 )
    			sum -= 9;
    		
    	}
    	return sum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Solution s = new Solution();
       int value = s.addDigits2(8898);
       System.out.println(value);
	}

}
