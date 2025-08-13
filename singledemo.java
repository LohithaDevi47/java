class A{
A()
{
System.out.println("inside A constructor");
}
}
class B extends A{
B(){
System.out.println("inside B constructor");
}
}
class Singledemo{
public static void main(String[] args){
B b=new B();
}
}