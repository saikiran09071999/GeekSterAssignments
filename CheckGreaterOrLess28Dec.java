import java.util.*;
class CheckGreaterOrLess28Dec{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println(checkNum(n));
 }
  public static String checkNum(int n){
    if(n>=10)
     return "number is greater than 10";
    else
     {
       if(n>=5)
        return "number is greater than 5";
       else
         return "number is lesser than 5";
     }
 }
}