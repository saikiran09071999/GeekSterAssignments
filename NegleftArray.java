import java.util.*;
class NegleftArray{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
  int i=0;
  int j=n-1,temp;
  while(i<j){
    if(a[i]>=0&&a[j]<0){
     temp=a[i];
     a[i]=a[j];
     a[j]=temp;
     i++;
    // j--;
   }
   else if(a[i]<0 && a[j]<0)
    i++;
   else if(a[i]>=0 && a[j]>=0)
    j--;
   else if(a[i]<0 && a[j]>=0)
    i++;
  }
  for(int k=0;k<n;k++)
   System.out.print(a[k]+" ");
 }
}