import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Sorted Columns Count
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int co=0;
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<c;i++){
		    boolean s=false;
		    for(int j=0;j+1<r;j++){
		        if(mat[j][i]<mat[j+1][i]){
		            s=true;
		        }
		    }
		    if(!s) co++;
		}
        System.out.print(co);
	}
}
