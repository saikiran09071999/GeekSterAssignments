import java.util.*;
class ArrayMiddle5Jan{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[10];
   for(int i=0;i<10;i++)
      a[i]=sc.nextInt();
    System.out.println(arrayMiddle(a));
 }
 public static int arrayMiddle(int a[])
  {
    int low=0,high=a.length-1;
    int mid=(low+high)/2;
    return a[mid];
  } 
}