import java.util.*;
class SumSeries{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    float sum=1.0f;
    for(int i=2;i<=n;i++){
      sum=sum+(float) 1/i;
    }
   System.out.println(sum);
  }
}