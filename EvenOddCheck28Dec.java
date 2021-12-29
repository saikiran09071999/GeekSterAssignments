import java.util.*;
class EvenOddCheck28Dec{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println(checkNum(n));
 }
  public static String checkNum(int n){
    if(n%2==0)
     return "even";
    else
     return "odd";
 }
}