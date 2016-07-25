
public class Solution {

	 public int getSum(int a, int b) {
	        int ai,bi;
	        int ext = 0;
	        int ans = 0;
	        for(int i=0; i<32; i++){
	            ai = ( a&(1<<i))!=0?1:0;
	            bi = ( b&(1<<i))!=0?1:0;  //此处如果判断>0,会因为第32位为1得到负数，导致判处逻辑出错
	            System.out.println( b&(1<<31) );
	            int ci = ai^bi^ext;
	            System.out.println(i+"  "+ai+"  "+bi+"  "+ext+" "+ci);
	            if(ci>0){
	                ans |= (1<<i);
	            }
	            int di=32;
	            if(ai>0)
	               di = di<<1;
	            else
	               di = di>>1;
	            if(bi>0)
	               di = di<<1;
	            else
	               di = di>>1;
	            if(ext>0)
	               di = di<<1;
	            else
	               di = di>>1;
	             
	            if(di>32)
	               ext=1;
	            else
	               ext = 0;
	        }
	        return ans;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int m = s.getSum(1, -1);
        System.out.print(m);
	}

}
