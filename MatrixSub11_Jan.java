import java.util.*;
class MatrixSub11_Jan{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int r1=sc.nextInt();
  int c1=sc.nextInt();
  int a[][]=new int[r1][c1];
  for(int i=0;i<r1;i++)
   for(int j=0;j<c1;j++)
   {
    a[i][j]=sc.nextInt();
   }
  int r2=sc.nextInt();
  int c2=sc.nextInt();
  int b[][]=new int[r2][c2];
  for(int i=0;i<r2;i++)
   for(int j=0;j<c2;j++)
   {
    b[i][j]=sc.nextInt();
   }
   if(r1==r2 && c1==c2)
    {
      int c[][]=new int[r1][c1];
      for(int i=0;i<r1;i++)
       for(int j=0;j<c1;j++)
       c[i][j]=a[i][j]-b[i][j];
      for(int i=0;i<r1;i++){
       for(int j=0;j<c1;j++)
        System.out.print(c[i][j]+" ");
       System.out.println("");
       } 
    }
   else
    System.out.println("could not add");
 }
}