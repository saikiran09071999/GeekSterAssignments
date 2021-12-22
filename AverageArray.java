import java.util.*;
class AverageArray{
 public static void main(String args[]){
   int a[]=new int[6];
   Scanner sc=new Scanner(System.in);
   System.out.println("enter 6 elements into the array");
   int sum=0;
   for(int i=0;i<6;i++){
    a[i]=sc.nextInt();
     sum+=a[i];
    }
   System.out.println("Average is: "+sum/6);
 }
}