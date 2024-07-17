import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Count of Ice Creams
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int cost=sc.nextInt();
		
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		int s=0;
		int c=0;
		for(int i:ar){
		    s+=i;
		    if(s<=cost) c++;
		}
		System.out.print(c);

	}
}
