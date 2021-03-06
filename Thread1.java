import java.lang.Thread;
class A extends Thread
{
public void run()
{
System.out.println("This is thread");
}
}
class Thread1
{
public static void main(String[]args)
{
A a=new A();
a.start();
}
}
