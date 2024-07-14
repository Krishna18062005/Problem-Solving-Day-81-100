class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int s=0;
        for(int i:nums){
            
            s+=encrypt(i);
            System.out.print(s);
        }
        return s;
    }
static int encrypt(int a){
    int m=0;
    int dc=0;
    while(a>0){
        dc++;
        m=Math.max(m,a%10);
        a/=10;
    }
    int l=m;
    for(int i=1;i<dc;i++){
       m=m*10+l;
       System.out.println(m);
    }
    return m;
}
}
import java.util.*;
class Solution {
    public String getSmallestString(String s) {
        char[]ar=s.toCharArray();
        List<String> list=new ArrayList<>();
        list.add(s);
        int i=0;
        for(;i<ar.length-1;i++){
            if(ar[i]%2==ar[i+1]%2){
                  char t=ar[i];
                  ar[i]=ar[i+1];
                  ar[i+1]=t;
            }
            list.add(new String(ar));
            ar=s.toCharArray();
        }
        Collections.sort(list);
        return list.get(0);
    }
}
