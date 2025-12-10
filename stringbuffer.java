class stringbuffer{
public static void main(String[] args){
StringBuffer sb1 = new StringBuffer("Hello World");
sb1.delete(0,6);
System.out.println(+sb1);
StringBuffer sb2 = new StringBuffer("hi everyone");
sb2.delete(0,sb2.length());
StringBuffer sb3 = new stringbuffer("Hello World");
sb3.deleteCharAt(0);
System.out.println(sb3);
}
}
