import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Power of 2
		int a=new Scanner(System.in).nextInt();
		if(a&(a-1)==0){
		    System.out.print("Yes\n"+sumofDigits(a));
		    return;
		}
		System.out.print("No\n"+nextPower2(a));

	}
	static int sumofDigits(int s){
	    int su=0;
	    while(s>0){
	        su+=s%10;
	        s/=10;
	    }
	    return su;
	}
	static int nextPower2(int a){
	    int i=0;
	    for(i=1;(int)Math.pow(2,i)<a;i++){
	        i=i;
	    }
	    return (int)Math.pow(2,i);
	}
}
int isPerfectPalindrome(int N)
{
    int ps=0;
for(int i=1;i*i<=N;i++){
    if(i*i==N){
        ps=1;
    }
}
int d=0;
if(ps==1){
    d=0;
    int t=N;
    while(t>0){
        d=d*10+t%10;
        t/=10;
    }
}

return d==N;
}
