import java.util.Scanner;
class bubblesort
{
public static void main(String[] args)
{
int i,n,j,temp;
int a[]=new int[20];
Scanner s=new Scanner(System.in);
System.out.println("enter no.of elements");
n=s.nextInt();
System.out.println("enter elements:");
for(i=0;i<n;i++)
a[i]=s.nextInt();
for(i=0;i<n;i++){
for(j=0;j<n-i-1;j++){
if(a[j]>a[j+1]){
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("after bubble sort:");
for(i=0;i<n;i++){
System.out.println(+a[i]);
}
}
}

