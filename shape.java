abtract class shape{
  abstract double area();
 }
class r extends shape{
   double b = 10.5;
   double c = 11.5;
   double area(){
      return (b*c);
   }
}
class s extends shape{
   double s = 7.4;
   double area(){
      return (s*s);
   }
}
class t extends shape{
   double a = 4.7;
   double d = 7.4;
   double area(){
      return (0.5*a*d);
   }
}
class Demo{
 public static void main(String[] args){
   r r1 = new r();
   s s1 = new s();
   t t1 = new t();
 System.out.println("Rectangle area ="+r1.area());
 System.out.println("Square area ="+s1.area());
 System.out.println("triangle area ="+t1.area());
  }
}