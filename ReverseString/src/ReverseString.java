import java.util.*;
import java.io.BufferedOutputStream;
public class ReverseString {

	public String reverseString(String s){
		String t = "";
		if (s==null||s.equals(""))
			return s;
		for(int i=s.length()-1; i>=0; i--){
			t += s.charAt(i);
		}
		return t;
	} /* TimeLimit exceeding */
	/*  Actually, I found because string is immutable, so every time str+= will create a new string which takes a lot run time*/
	
	public String reverse2(String s){
		StringBuffer str_buffer = new StringBuffer(s);
		return str_buffer.reverse().toString();
	}
	
	public String reverse3(String s){
		if(s==null || s.equals(""))
			return s;
		char[] arrChar = s.toCharArray();
		int len = arrChar.length;
		for(int i=0; ; i++){
			if ( i>=(len-i-1) )
				break;
			char temp = arrChar[i];
			arrChar[i] = arrChar[len-i-1];
			arrChar[len-i-1] = temp;
		}
		return new String(arrChar);			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "hello";
       ReverseString ch = new ReverseString();
       String t = ch.reverse3(s);
       System.out.print(t);
	}

}
