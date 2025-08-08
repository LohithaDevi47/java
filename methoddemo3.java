class C{
int l=40,b=70;
int area(){
return l*b;
}
}
class methoddemo3{
public static void main(String[] args){
C s=new C();
int a=s.area();
System.out.println("the area is:"+a);
}
} 