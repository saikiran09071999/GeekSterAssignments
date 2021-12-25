import java.util.*;
class CheckAnagram{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String str1=sc.next();
   String str2=sc.next();
   int a[]=new int[26];
   int b[]=new int[26];
   boolean flag=true;
   if(str1.length()==str2.length())
   {
     for(int i=0;i<str1.length();i++)
     {
       a[str1.charAt(i)-'a']++;
       b[str2.charAt(i)-'a']++;
     }
    for(int i=0;i<26;i++)
    {
       if(a[i]!=b[i])
       {
          flag=false;
          break;
       }
    }
    if(flag)
     System.out.println("True");
    else
      System.out.println("False");
   }
   else
    System.out.println("False");
 }
}