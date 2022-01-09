class MethodOverLoad4Jan{
  public static void main(String args[])
 {
  area(2);
  area(2,3);
 }
 public static void area(int a)
  {
   System.out.println("area of a square: "+(a*a));
  }
  public static void area(int a,int b)
  {
   System.out.println("area of a rectangle: "+(a*b));
  }
}