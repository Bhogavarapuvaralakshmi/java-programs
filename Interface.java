interface area
{
final float pi=3.14f;
public float compute(float p,float q);
}
class rectangle implements area
{
public float compute(float p,float q)
{
return(p*q);
}
}
class circle implements area
{
public float compute(float p,float q)
{
return(pi*p*p);
}
}
class Interface
{
public static void main(String[]args)
{
rectangle r=new rectangle();
circle c=new circle();
area a;
a=r;
System.out.println("rectange area="+a.compute(10,20));
a=c;
System.out.println("circle area="+a.compute(10,20));
}
}
