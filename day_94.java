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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Mirror & Water Images- Quadrant
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		int[][] usa=new int[r][c];
		for(int i=0;i<r/2;i++){
		    for(int j=0;j<c/2;j++){
		        usa[i][j]=usa[i][c-j-1]=usa[r-i-1][j]=usa[r-i-1][c-j-1]=mat[i][j];
		    }
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(usa[i][j]+" ");
		    }System.out.println();
		}

	}
}
