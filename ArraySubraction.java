import java.util.*;
class ArraySubraction{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int m=sc.nextInt();
  int n=sc.nextInt();
  if(m==n)
  {
    int a[]=new int[n];
    int b[]=new int[m];
   for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
   for(int i=0;i<n;i++)
    b[i]=sc.nextInt();
   System.out.println("\n");
   for(int i=0;i<n;i++)
    System.out.print(a[i]-b[i]+" ");  
  }
 else
  System.out.println("difference is not possible because of different array lengths");
 }
}