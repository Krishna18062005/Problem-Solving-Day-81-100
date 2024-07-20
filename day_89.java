import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Water Image - Diamond Pattern
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ans=0;
		for(int i=0;i<a*2;i++){
		    if(i<a){
		    for(int j=0;j<a-i-1;j++){
		        System.out.print("*");
		    }ans+=i+1;
		    int m=ans;
		    for(int k=0;k<=i;k++){
		        
		        System.out.print(ans--+" ");
		    }ans=m;
		    System.out.println();}
		    else{
		        for(int j=0;j<i-a;j++){
		            System.out.print("*");
		        }
		        for(int k=i-a;k<a;k++){
		            System.out.print(ans--+" ");
		        }System.out.println();
		    }
		}

	}
}
