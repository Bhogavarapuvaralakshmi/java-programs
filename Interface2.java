interface A
{
void display();
}
class B implements A
{
public void display()
{
System.out.println("this is interface");
}
}
class Interface2
{
public static void main(String[]args)
{
B v=new B();
v.display();
}
}