class para
{
para(int x,int y)
{
System.out.println("mul="+(x+y));
}
para(int x,int y,int z)
{
System.out.println("add="+(x+y+x));
}
}
class overload
{
public static void main(String[]args)
{
para p=new para(10,20);
para p1=new para(30,40,50);
}
}