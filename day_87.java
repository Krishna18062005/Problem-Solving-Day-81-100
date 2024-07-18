public static int squareTheEnds(int N){
String num=Integer.toString(N);
int fi=num.charAt(0)-'0';
int la=num.charAt(num.length()-1)-'0';
String ans=(fi*fi)+num.substring(1,num.length()-1)+(la*la);
return Integer.parseInt(ans);
}
