import java.util.*;
public class Hello {

    public static void main(String[] args){
		String str=new Scanner(System.in).next();
		char[] ar=str.toCharArray();
		System.out.print(check(ar)?"YES":"NO");
		

	}
	public static boolean check(char[] ar){
	    int i=0;
	    int j=ar.length-1;
	    while(i<=j){
	        if((ar[i]=='A'||ar[i]=='a')&&(ar[j]=='Z'||ar[j]=='z')){
	            return false;
	        }
	        else if(Math.abs((int)ar[i]-(int)ar[j])>2) return false;
	        i++;
	        j--;
	    }
	    return true;
	}
}
