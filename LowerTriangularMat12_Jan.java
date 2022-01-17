import java.util.*;
class LowerTriangularMat12_Jan{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[][]=new int[n][n];
  for(int i=0;i<n;i++)
   for(int j=0;j<n;j++)
   {
     int val=sc.nextInt();
     if(j>i)
      a[i][j]=0;
     else
      a[i][j]=val;
   }
  for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       System.out.print(a[i][j]+" ");
     }
    System.out.println();
   }
 }
}