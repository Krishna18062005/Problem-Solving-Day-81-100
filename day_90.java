class Solution {
    public int minChanges(int n, int k) {
        StringBuilder f=new StringBuilder(Integer.toBinaryString(n));
        StringBuilder s=new StringBuilder(Integer.toBinaryString(k));
        
        int c=0;
        
        int max=(f.length()>s.length())?f.length():s.length();
        StringBuilder fs=new StringBuilder(make(f.toString(),max));
        StringBuilder ss=new StringBuilder(make(s.toString(),max));
        String q="";
        System.out.print(fs+" "+ss);
        for(int i=0;i<max;i++){
            if(fs.charAt(i)==ss.charAt(i)){ q+=fs.charAt(i);
                continue;}
                 if(ss.charAt(i)=='1'&&fs.charAt(i)=='0') return -1;
            if(fs.charAt(i)=='1'&&ss.charAt(i)=='0'){ 
                c++;
                q+=fs.charAt(i);
                }
                else{
                    q+=fs.charAt(i);
                }
             }
        return c;


    }
    static String make(String a,int si){
        int d=si-a.length();
        String ans="";
        for(int i=0;i<d;i++){
            ans+='0';
        }
        ans+=a;
        return ans;

    }
}
