import java.util.*;
class PopulateArray{
  public static void main(String args[]){
   int a[]=new int[5];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<5;i++)
    a[i]=sc.nextInt();
   System.out.println("Array Elements are:");
   for(int i=0;i<5;i++)
     System.out.print(a[i]+" ");
  }
}