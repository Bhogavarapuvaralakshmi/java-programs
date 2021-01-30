import java.util.Scanner;
import java.io.*;
class Do1
{
public static void main(String[]args)
{
int i=1,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
do 
{
System.out.println(i+" ");
i++;
}while(i<=n);
}
}