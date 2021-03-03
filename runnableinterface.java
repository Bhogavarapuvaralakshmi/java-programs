import java.io.*;
class X implements Runnable
{
public void run()
{
for(int i=1;i<=6;i++)
{
System.out.println("Thread X:"+i);
}
}
}
class runnableinterface
{
public static void main(String[]args)
{
X x=new X();
Thread t=new Thread(x);
t.start();
}
}