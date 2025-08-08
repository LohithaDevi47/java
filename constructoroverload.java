class A{
int l,b;
A(){
l=10;
b=30;
}
A(int u,int v){
l=u;
b=v;
}
int area(){
return l*b;
}
}
class constructoroverload{
public static void main(String[] args){
A s=new A();
int a=s.area();
a t=new A(80,90);
int a1=t.area();
System.out.println("THE AREA IS :"+a);
System.out.println("THE AREA IS :"+a1);
}
}