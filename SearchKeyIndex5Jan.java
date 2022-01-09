import java.util.*;
class SearchKeyIndex5Jan{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int a[]=new int[10];
   for(int i=0;i<10;i++)
    a[i]=sc.nextInt();
    int key=sc.nextInt();
    int index=searchKeyIndex(a,key);
   System.out.println(index);
 }
  public static int searchKeyIndex(int a[],int key)
  {
    int index=-1;
    for(int i=0;i<10;i++)
     if(a[i]==key){
       index=i;
       break;
     }
     return index;
  }
}