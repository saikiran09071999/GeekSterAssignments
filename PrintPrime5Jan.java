import java.util.*;
class PrintPrime5Jan{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int a[]=new int[10];
   for(int i=0;i<10;i++)
    a[i]=sc.nextInt();
   for(int i=0;i<10;i++)
    printPrime(a[i]);
 }
  public static void printPrime(int n)
  {
    int flag=0;
    if(n==1)
      flag=1;
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0){
        flag=1;
         break;
        }
    }
  if(flag==0)
    System.out.println(n);
  }
}