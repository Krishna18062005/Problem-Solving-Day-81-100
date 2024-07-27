class Solution {
    public int[] circularGameLosers(int n, int k) {
        if(n==1) {
            int[] ans={};
            return ans;}
        Set<Integer> a=new HashSet<>();
        int s=n;
        n=0;
        a.add(0);
        int in=1;
        while(true){
            
            n=(n+in*k)%s;
            

           //System.out.println(n);
            if(a.contains(n)){
                break;
            }

            a.add(n);
            in++;

        }
        if(s<=a.size()){
            int[] ans={};
            return ans;}
        int[] ans=new int[s-a.size()];
        int id=0;
        for(int i=0;i<s;i++){
            if(!a.contains(i)) ans[id++]=i+1;
        }
        return ans;
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//String - Pattern matching
		Scanner sc=new Scanner(System.in);
		char[] s1=sc.nextLine().toCharArray();
		String[] s2=sc.nextLine().split(" ");
		Set<Character> setc=new HashSet<>();
		for(char i : s1) setc.add(i);
		Set<String> sets=new HashSet<>();
		for(String i: s2) sets.add(i);
		
		if(setc.size()!=sets.size()){
		    System.out.print("NO");return;
		}
		HashMap<Character,String> map=new HashMap<>();
		for(int i=0;i<s1.length;i++){
		    if(map.containsKey(s1[i])){
		        if(!(map.get(s1[i]).equals(s2[i]))){
		            System.out.print("NO");
		            return;
		        }
		    }
		    else{
		        map.put(s1[i],s2[i]);
		    }
		}
		System.out.print("YES");

	}
}
