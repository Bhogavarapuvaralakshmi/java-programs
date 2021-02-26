class A extends Thread
{
public void run()
{
for(int i=1;i<=3;i++)
System.out.println("thread A:i="+i);
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=3;j++)
System.out.println("Thread B:j="+j);
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<+3;k++)
System.out.println("Thread C:k="+k);
}
}
class Multithread
{
public static void main(String[]args)
{
A x=new A();
B y=new B();
C z=new C();
x.start();
y.start();
z.start();
}
}
