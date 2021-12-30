import java.util.*;
class StringConcat29Dec{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter two strings");
   String str1=sc.nextLine();
   String str2=sc.nextLine();
   System.out.println(myConcat(str1,str2)); 
 }
 public static String myConcat(String str1,String str2){
    return str1+" "+str2;
 }
}