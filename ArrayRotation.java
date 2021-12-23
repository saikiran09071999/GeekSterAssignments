import java.util.*;
class ArrayRotation{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
 int k=sc.nextInt();
  if(k>=0){
     k=k%n;
     if(k==0)
       {
       }
      else{
  rev(a,0,n-k-1);
  rev(a,n-k,n-1);
   rev(a,0,n-1);
     }
  }
  else
  {
    k=(int) Math.abs(n-k);
    k=k%n;
     if(k==0)
       {
       }
      else{
  rev(a,0,n-k-1);
  rev(a,n-k,n-1);
   rev(a,0,n-1);
     }
  }
  for(int i=0;i<n;i++)
   System.out.print(a[i]+" ");
 }
 public static void rev(int a[],int i,int j)
  {
     int temp=0;
   while(i<j){
     temp=a[i];
     a[i]=a[j];
     a[j]=temp;
     i++;
     j--;
   }
  }
}