import java.io.*;
class Sup
{
int n=90;
}
class Supe extends Sup
{
int n=80;
void disp()
{
System.out.println("n"+super.n);
}
}
class Super
{
public static void main(String[]args)
{
Supe S=new Supe();
S.disp();
}
}