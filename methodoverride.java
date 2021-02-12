class base
{
void disp()
{
System.out.println("this is parent class");
}
}
class derived extends base
{
void disp()
{
super.disp();
System.out.println("this is child class");
}
}
class methodoverride
{
public static void main(String[]args)
{
derived d=new derived();
d.disp();
}
}