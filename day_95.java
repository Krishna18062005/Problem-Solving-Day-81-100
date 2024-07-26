import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sort Integers- Reverse
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int[] ar=new int[n];
	int[] rev=new int[n];
		for(int i=0;i<n;i++){
		    StringBuilder st=new StringBuilder(sc.next());
		    ar[i]=Integer.parseInt(st.toString());
		    rev[i]=Integer.parseInt(st.reverse().toString());
		    
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(rev[i]>rev[j]){
		            int t=ar[i];
		            ar[i]=ar[j];
		            ar[j]=t;
		            int te=rev[i];
		            rev[i]=rev[j];
		            rev[j]=te;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(ar[i]+" ");
		}

	}
	
}
