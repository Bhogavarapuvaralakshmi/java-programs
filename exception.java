import java.io.*;
class exception
{
public static void main(String[]args)
{
int a[]={10,20};
int b=10;
float x;	
try
{
x=a[1]/b-a[0];
}
catch(ArithmeticException e)
{
System.out.println("Divisionerror");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexerror");
}
}
}
