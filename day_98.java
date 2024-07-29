import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Transpose Matrix & Reverse Rows
		int n=new Scanner(System.in).nextInt();
		int a=n;
		for(int i=0;i<a;i++){
		    if(i%2==0){
		        for(int j=0;j<a;j++){
		            System.out.print(a*(j+1)+i+" ");
		        }
		        System.out.println();
		    }
		    else{
		        for(int k=a;k>0;k--){
		            System.out.print(a*(k)+i+" ");
		        }
		        System.out.println();
		    }
		}

	}
}
