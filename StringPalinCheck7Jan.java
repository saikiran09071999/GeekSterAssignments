import java.util.*;
class StringPalinCheck7Jan{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   str=str.toLowerCase();
   int l=0;
   int h=str.length()-1;
   boolean flag=true;
   while(l<h)
   {
    if(str.charAt(l)!=str.charAt(h)){
      flag=false;
      break;
    }
    l++;
    h--; 
   }
  if(flag)
   System.out.println("Palindrome");
  else
   System.out.println("not palindrome");
 }
}