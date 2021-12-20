class PyramidPattern{
  public static void main(String args[]){
   int n=9;
   int x=n/2;
   int pos=0,count=0;
   for(int i=0;i<=n/2;i++)
   {
    pos=0;
    count=0;
    for(int j=0;j<n;j++)
     {
      if(x==j)
      {
       while(true){
         if(count==i+1)
           break;
         if(pos%2==0)
         {
       System.out.print("*");
           count++;
          }
         else{
          System.out.print(" ");
           }
          pos++;
        }
        break;
       }
      else
       System.out.print(" ");
     }
     x--;
     System.out.println("");
   }
 }
}