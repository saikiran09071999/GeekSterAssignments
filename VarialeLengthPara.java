class VarialeLengthPara{
 public static void main(String args[]){
  System.out.println(myVarArgsFun(1,5,7,2,3));
    System.out.println(myVarArgsFun(1,2,3));
System.out.println(myVarArgsFun(5,6));
 }
  public static int myVarArgsFun(int ...a){
   int sum=0;
   for(int i=0;i<a.length;i++)
    sum+=a[i];
   return sum;
 }
}