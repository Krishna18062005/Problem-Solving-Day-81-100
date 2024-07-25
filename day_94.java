import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Last Occurence Sorting
		
		Scanner sc=new Scanner(System.in);
		String ip1=sc.next();
		String ip2=sc.next();
		int[] ar=new int[ip2.length()];
		for(int i=0;i<ip2.length();i++){
		    ar[i]=ip1.lastIndexOf(""+ip2.charAt(i));
		}
		char[] ip=ip2.toCharArray();
		for(int i=0;i<ip2.length();i++){
		    for(int j=i+1;j<ip2.length();j++){
		        if(ar[i]>ar[j]){
		            int t=ar[i];
		            ar[i]=ar[j];
		            ar[j]=t;
		            char te=ip[i];
		            ip[i]=ip[j];
		            ip[j]=te;
		        }
		    }
		}
		System.out.print(ip);
		

	}
}
