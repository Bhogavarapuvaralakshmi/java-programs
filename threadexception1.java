class A extends Thread
{
public void run()
{
for(int i=1;i<=3;i++)
{
if(i==2)
try
{
sleep(1000);
}
catch(Exception e)
{
}
System.out.println("i="+i);
}
}
}
class threadexception1
{
public static void main(String[]args)
{
A a=new A();
a.start();
}
}