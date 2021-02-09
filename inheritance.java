class base
{
void print()
{
System.out.println("this is parent class");
}
}
class derived extends base
{
void disp()
{
System.out.println("this is child class");
}
}
class inheritance
{
public static void main(String[]args)
{
derived d=new derived();
d.print();
d.disp();
}
}