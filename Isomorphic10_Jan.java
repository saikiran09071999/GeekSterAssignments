import java.util.*;
class Isomorphic10_Jan{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   boolean flag=true;
   HashMap<Character,Character> hm=new HashMap<>();
   String str1=sc.next();
   String str2=sc.next();
   if(str1.length()==str2.length())
   {
    for(int i=0;i<str1.length();i++)
     {
      if(hm.containsKey(str1.charAt(i))){
         if(hm.get(str1.charAt(i))!=str2.charAt(i)){
           flag=false;
           break;
         }
       }
       else
        hm.put(str1.charAt(i),str2.charAt(i));
     } 
     if(flag)
      System.out.println("isomorphic string");
      else
       System.out.println("not isomorphic string");  
   }
  else
   System.out.println("not isomorphic string");
 }
}