import java.util.*;
class PrintPositiveArray5Jan{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[10];
   for(int i=0;i<10;i++)
      a[i]=sc.nextInt();
   positiveArray(a);
 }
 public static void positiveArray(int a[])
  {
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>0)
       System.out.print(a[i]+" ");
    }
  } 
}