class MinMax{
 public static void main(String args[]){
  int a[]={6,7,1,2,3,8,4,10,6,7};
  int min=Integer.MAX_VALUE; 
  int max=Integer.MIN_VALUE;  
  for(int i=0;i<a.length;i++){
     if(a[i]<min)
      min=a[i];
     if(a[i]>max)
       max=a[i];
   }
   System.out.println(min+" "+max);
 }
}