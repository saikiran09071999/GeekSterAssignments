import java.util.*;
class SparseMatrix12_Jan{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
  int a[][]=new int[n][m];
  int count=0;
  for(int i=0;i<n;i++){
   for(int j=0;j<m;j++)
   {
     int val=sc.nextInt();
     if(val==0)
      count++;
   }
  }
  
 if(count>((n*m)/2))
   System.out.println("sparse matrix");
 else
  System.out.println("not");
 }
}