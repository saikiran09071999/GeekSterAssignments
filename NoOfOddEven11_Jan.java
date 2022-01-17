import java.util.*;
class NoOfOddEven11_Jan{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int r1=sc.nextInt();
  int c1=sc.nextInt();
  int odd=0;
  int even=0;
  int a[][]=new int[r1][c1];
  for(int i=0;i<r1;i++)
   for(int j=0;j<c1;j++)
   {
    a[i][j]=sc.nextInt();
     if(a[i][j]%2==0)
      even++;
     else
      odd++;
   }
  System.out.println("Even: "+even+" "+"\nOdd: "+odd);
  }
}