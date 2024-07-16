import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Smallest Possible Even Integer;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().replace(" ","");
		char[] ar=s.toCharArray();
		Arrays.sort(ar);
		System.out.print(makeChange(ar));

	}
	static String makeChange(char[] a){
	    int j=a.length-1;
	    while(j>=0){
	        if(Integer.parseInt(a[j]+"")%2==0){
	            break;
	        }
	        j--;
	    }
	    if(j==-1){
	        return "-1";
	    }
	    String ans="";
	    for(int i=0;i<a.length;i++){
	        if(i!=j)
	        ans+=a[i];
	    }
	    ans+=a[j];
	    int i=0;
	    while(i<ans.length()){
	        if(ans.charAt(i)!='0'){
	            break;
	        }i++;
	    }
	    ans=ans.charAt(i)+ans.substring(0,i)+ans.substring(i+1);
	    
	    return ans;
	}
}
