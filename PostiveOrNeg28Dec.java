import java.util.*;
class PostiveOrNeg28Dec{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println(checkNum(n));
 }
  public static String checkNum(int n){
    if(n>=0)
     return "Postive";
    else
     return "Negative";
 }
}