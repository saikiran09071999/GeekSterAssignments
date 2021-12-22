class CountPrime{
 public static void main(String args[]){
   int a[]={2,3,4,5,6,7,8};
    int count=0;
   for(int i=0;i<a.length;i++)
   {
     if(isPrime(a[i]))
      count++;
   }
  System.out.println(count);
 }
 public static boolean isPrime(int n){
   boolean flag=true;
    if(n==2)
      return flag;
    else{
   for(int i=2;i<=n/2;i++)
   {
      if(n%i==0)
       {
         flag=false;
         break;
       }
   }
    return flag;
   }
 }
}