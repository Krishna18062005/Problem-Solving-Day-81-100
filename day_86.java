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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Rhyming Words
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int c=0;
		for(int i=0;i<str.length;i++){
		    if(str[i].equals("")) continue;
		    String seq=str[i].substring(str[i].length()/2).toLowerCase();
		    Boolean cc=false;
		    for(int j=i+1;j<str.length;j++){
		        if(str[j].substring(str[j].length()/2).toLowerCase().equals(seq)){
		         cc=true;   str[j]="";
		            c++;
		        }
		    }
		   if(cc) c++;
		}
		System.out.print(c);

	}
}
