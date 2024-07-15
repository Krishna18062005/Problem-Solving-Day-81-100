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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Rotate Matrix by X degrees
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int[][] mat=new int[s][s];
		for(int i=0;i<s;i++) for(int j=0;j<s;j++) mat[i][j]=sc.nextInt();
		int deg=sc.nextInt();
		if(deg%90!=0){
		    System.out.print("INVALID");return;
		}
		switch(deg%360){
		    case 0:
		        break;
		     case 90:
		         rotate(mat);
		         break;
		     case 180:
		         rotate(mat);
		         rotate(mat);
		         break;
		     case 270:
		         for(int i=0;i<3;i++)
		         rotate(mat);
		         break;
		}
		for(int i=0;i<s;i++){
		    for(int j=0;j<s;j++) {
		        System.out.print(mat[i][j]+" ");
  		    }
		    System.out.println();
		}
		
	}
	static void rotate(int[][] ma){
	    int[][] rs=new int[ma.length][ma.length];
	    for(int i=0;i<ma.length;i++){
	        for(int j=0;j<ma.length;j++){
	            rs[j][ma.length-i-1]=ma[i][j];
	        }
	    }
	    for(int i=0;i<ma.length;i++) for(int j=0;j<ma.length;j++) ma[i][j]=rs[i][j];
	}
}
