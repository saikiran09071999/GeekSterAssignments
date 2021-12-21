import java.util.*;
class ArrayTargetValue{
  public static void main(String args[]){
   int a[]=new int[10];
   int count=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter 10 array elements:");
   for(int i=0;i<10;i++)
    a[i]=sc.nextInt();
   System.out.println("enter target element to count:");
   int target=sc.nextInt();
   for(int i=0;i<10;i++){
      if(a[i]==target)
       count++;
    }
   System.out.println(count);
  }
}