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
class thread2
{
public static void main(String[]args)
{
A x=new A();
B y=new B();
x.setPriority(Thread.MIN_PRIORITY);
y.setPriority(Thread.MAX_PRIORITY);
x.start();
y.start();
}
}
