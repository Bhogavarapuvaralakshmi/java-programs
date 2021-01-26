class cal3
{
int a=20,b=30;
void sum()
{
System.out.print("addition=",+(a+b));
}
void mult()
{
System.out.print("mult=",+(a*b));
}
}
class vara
{
public static void main(String[]args)
{
cal3 ca=new cal3();
ca.sum();
ca.mult();
}
}