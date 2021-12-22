class SecondLargestArray{
 public static void main(String args[]){
  int a[]={6,7,1,2,3,8,4,9};
  int smax=Integer.MIN_VALUE;
  int max=Integer.MIN_VALUE;
  for(int i=0;i<a.length;i++){
      if(a[i]>max){
       smax=max;
       max=a[i];
       }
   }
   System.out.println(smax);
 }
}