public static int squareTheEnds(int N){
String num=Integer.toString(N);
int fi=num.charAt(0)-'0';
int la=num.charAt(num.length()-1)-'0';
String ans=(fi*fi)+num.substring(1,num.length()-1)+(la*la);
return Integer.parseInt(ans);
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Next Greater-No Consecutive
		int n=new Scanner(System.in).nextInt();
		while(!noConsecutive1orNot(n)) n++;
		System.out.print(n);   
	}
	public static boolean noConsecutive1orNot(int n){
	    String bin=Integer.toBinaryString(n);
	    for(int i=0;i<bin.length()-1;i++){
	        if(bin.charAt(i)=='1'&&bin.charAt(i+1)=='1'){
	            return false;
	        }
	    }
	    return true;
	}
}
