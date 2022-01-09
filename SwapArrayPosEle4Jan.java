import java.util.*;
class SwapArrayPosEle4Jan{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size:");
  int n=sc.nextInt();
  int a[]=new int[n];
   System.out.println("enter array elements:");
  for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
  System.out.println("enter 2 elements positions to be swapped:");
   int pos1=sc.nextInt();
   int pos2=sc.nextInt();
   mySwap(pos1,pos2,a,n);
 }
  public static void mySwap(int pos1,int pos2,int a[],int n){
   int temp=0;
  temp=a[pos1];
  a[pos1]=a[pos2];
  a[pos2]=temp;
  System.out.println("array elements are:");
   for(int i=0;i<n;i++)
    System.out.print(" "+a[i]);
 }
}