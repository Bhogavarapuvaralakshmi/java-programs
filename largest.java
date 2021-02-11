import java.util.Scanner;
class largest
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter b value");
b=sc.nextInt();
if(a>b)
{
System.out.println(a+"value is big");
}
else
{
System.out.println(b+"value is big");
}
}
}