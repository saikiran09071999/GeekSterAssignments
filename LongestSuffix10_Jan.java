class LongestSuffix10_Jan{
 public static void main(String args[]){
  int flag=1;
  int sub=1;
  String tmp="";
  char ch;
  String str[]={"hello","welcomehello","byefello"};
  int min=Integer.MAX_VALUE;
  for(int i=0;i<str.length;i++)
  {
   if(str[i].length()<min)
    min=str[i].length();
  } 
  for(int i=min-1;i>=0;i--)
  {
   ch=str[0].charAt(str[0].length()-sub);
  
   for(int j=1;j<str.length;j++){
      if(ch==str[j].charAt(str[j].length()-sub))
        continue;
      else
      {
        flag=0;
         break;
      }
   } 
    if(flag==0)
      break;
    else{
      tmp=Character.toString(ch)+tmp;
    }
   sub++;
  }
  System.out.println(tmp); 
 }
}