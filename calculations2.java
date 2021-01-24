class cal
{
int a=20,b=10;
void sum()
{
System.out.println("add="+(a+b));
}
void mult()
{
System.out.println("mult="+(a*b));
}
void sub()
{
System.out.println("sub"+(a-b));
}
void div()
{
System.out.println("div"+(a/b));
}
}
class calculations2
{
public static void main(String[]args)
{
cal c=new cal();
c.sum();
c.sub();
c.mult();
c.div();
}
}
