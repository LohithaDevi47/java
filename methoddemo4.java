class D{
int area(int l,int b){
return l*b;
}
}
class methoddemo4{
public static void main(String[] args){
D s=new D();
int a=s.area(70,70);
System.out.println("The area is:"+a);
}
}