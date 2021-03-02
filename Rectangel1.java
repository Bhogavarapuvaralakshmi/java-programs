class Rectangle
{
int l,b;
void get(int p,int q)
{
l=p;
b=q;
}
int area()
{
return(l*b);
}
}
class Rectangel1
{
public static void main(String[]args)
{
Rectangle r=new Rectangle();
r.get(10,20);
System.out.println("area of rectangle="+r.area());
}
}