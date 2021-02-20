class Base
{
int a,b;
Base(int x,int y)
{
a=x;
b=y;
}
void display()
{
System.out.println(a);
System.out.println(b);
}
}
class Derived extends Base
{
int c;
Derived(int x,int y,int z)
{
super(x,y);
c=z;
}
void display()
{
super.display();
System.out.println("the value of c="+c);
}
}
class methodoverriding1
{
public static void main(String[]args)
{
Derived d=new Derived(5,10,15);
d.display();
}
}