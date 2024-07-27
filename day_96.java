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
