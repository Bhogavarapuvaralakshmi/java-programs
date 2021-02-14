interface A
{
int a=10,b=20;
void sum();
}
interface B extends A
{
public void mult();
}
class C implements B
{
public void sum()
{
System.out.println("add="+(a+b));
}
public void mult()
{
System.out.println("mult="+(a*b));
}
}
class Interface1
{
public static void main(string[]args)
{
C d=new C();
d.sum();
d.mult();
}
}