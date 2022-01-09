import java.util.*;
class ArraySum5Jan{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[10];
   for(int i=0;i<10;i++)
      a[i]=sc.nextInt();
    System.out.println(arraySum(a));
 }
 public static int arraySum(int a[])
  {
    int sum=0;
    for(int i=0;i<10;i++)
      sum+=a[i];
    return sum;
  } 
}