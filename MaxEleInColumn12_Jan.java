import java.util.*;
class MaxEleInColumn12_Jan{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
  int a[][]=new int[n][m];
  for(int i=0;i<n;i++)
   for(int j=0;j<m;j++)
   {
    a[i][j]=sc.nextInt();
   }
  for(int i=0;i<m;i++)
   {
    int max=Integer.MIN_VALUE;
     for(int j=0;j<n;j++)
     {
       if(a[j][i]>max)
        max=a[j][i];
     }
    System.out.println(max);
   }
 }
}