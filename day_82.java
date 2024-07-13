import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Odd Digital Sum-N Integers
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean p=true;
		while(n-->0){
		    long a=sc.nextLong();
		    if(dig(a)%2==1){
		        p=false;
		        System.out.print(a+" ");
		    }
		}
		if(p) System.out.print(-1);

	}
	static long dig(long a){
	    long s=0;
	    while(a>0){
	      s+=a%10;a/=10;  
	    }
	    if(s<10)
	    return s;
	    
	    return dig(s);
	    
	}
}
