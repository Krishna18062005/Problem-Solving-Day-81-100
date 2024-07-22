
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    String te=names[i];
                    names[i]=names[j];
                    names[j]=te;
                }

            }
            
        }return names;
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//print Operators
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		int fn=sc.nextInt();
		int sn=sc.nextInt();
		for(int i=0;i<n;i++){
		    if((int)(fn/sn)==ar[i]) System.out.print("/ ");
		    else if(fn-sn==ar[i]) System.out.print("- ");
		    else if(fn*sn==ar[i]) System.out.print("* ");
		    else if((fn+sn)==ar[i]) System.out.print("+ ");
		    else System.out.print("# ");
		}

	}
}
