import java.util.*;
class NoofSpecialChars10_Jan{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   int count=0;
   for(int i=0;i<str.length();i++)
   {
     if((str.charAt(i)>=48 && str.charAt(i)<=57) || (str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122))
      continue;
     else
      count++;
   }
   System.out.println(count);
  }
}