
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
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Password Rules & Strength
		String str=new Scanner(System.in).next();
		if(str.length()<8) {
		    System.out.print("WEAK");
		    return;
		}
		boolean r1,r2,r3,r4;
		r1=r2=r3=r4=false;
		
		for(char i:str.toCharArray()){
		    if(i>='a'&&i<='z'){
		        r1=true;
		    }
		    else if(i>='A'&&i<='Z') {r2=true;}
		    else if(i>='0'&&i<='9') r3=true;
		    else
		    r4=true;
		}
		r1=r1&&r2;
		if(r1&&r2&&r3&&r4){
		    System.out.print("STRONG");
		}
		else if(r1&&r3||r1&&r4||r3&&r4){
		    System.out.print("GOOD");
		}
		else if((r1&&r2)||r3||r4) System.out.print("MEDIUM");
		else System.out.print("WEAK");

	}
}
