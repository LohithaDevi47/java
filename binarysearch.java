import java.util.Scanner;
class binarysearch
{
public static void main (String args[])
{
int n,i,num,low,high,mid;
int a[] = new int[20];
Scanner s = new Scanner(System.in);
System.out.println("enter the total elements");
n = s.nextInt();
System.out.println("enter the elements :");
for(i=0;i<n;i++)
a[i]= s.nextInt();
System.out.println("enter search value:");
num = s.nextInt();
low=0;
high=n-1;
mid=(high+low)/2;
while(high>=low)
{
if(a[mid] == num)
{
System.out.println("number is found");
break;
}
else if(num>a[mid])
{
low=mid+1;
}
else
{
high=mid-1;
}
}
if(low>high){
System.out.println("number is not found");
}
}
}