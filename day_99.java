import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Next Integer Prime Digits
		int ip=new Scanner(System.in).nextInt();
		ip++;
		while(!primeDigit(ip+"")){
		    ip++;
		}
		System.out.print(ip);

	}
	static boolean primeDigit(String a){
	    String pd="2357";
	    for(int i=0;i<a.length();i++){
	        if(!pd.contains(a.charAt(i)+"")) return false;
	    }
	    return true;
	}
}
