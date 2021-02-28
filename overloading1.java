class para
{
void sum(int x,int y)
{
System.out.println("add="+(x+y));
}
void sum(float x,float y)
{
System.out.println("add="+(x+y));
}
}
class overloading1
{
public static void main(String[]args)
{
para p=new para();
p.sum(10,50);
p.sum(15.5f,25.5f);
}
}