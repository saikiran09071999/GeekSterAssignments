import java.util.*;
class InsertValAtInd{
   public static void main(String args[]){
   int a[]=new int[10];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<10;i++)
    a[i]=sc.nextInt();
   int ind=sc.nextInt();
   int val=sc.nextInt();
   if(ind<0 || ind>=10)
    System.out.println("index is out of range");
   else{
     System.out.println("elements before insertion:");
     for(int i=0;i<10;i++)
      System.out.print(a[i]+" ");
      a[ind]=val;
     System.out.println("elements after insertion:");
      for(int i=0;i<10;i++)
      System.out.print(a[i]+" ");
   } 
  }
}