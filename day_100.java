
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//All Digits Pair Count
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] ar=new int[n];
		int c=0;
		for(int i=0;i<n;i++) ar[i]=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(isContainsAll((ar[i]+""+ar[j]))){
		            c++;
		        }
		    }
		}
		System.out.print(c);

	}
	static boolean isContainsAll(String st){
	    
	    for(int i=0;i<10;i++){
	        if(!st.contains(i+"")) return false;
	    }return true;
	}
}
