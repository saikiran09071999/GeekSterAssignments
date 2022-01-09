import java.util.*;
class SearchFirstIndex6Jan{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int key=sc.nextInt();
    int index=searchKeyIndex(a,key);
   System.out.println(index);
 }
  public static int searchKeyIndex(int a[],int key)
  {
    int index=-1;
    for(int i=0;i<a.length;i++)
     if(a[i]==key){
       index=i;
       break;
     }
     return index;
  }
}