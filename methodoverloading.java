class methodoverload
{
int add(int p,int q)
{
return(p+q);
}
float add(int p,int q,float r)
{
return(p+q+r);
}
}
class methodoverloading
{
public static void main(String[]args)
{
methodoverload m=new methodoverload();
int a=m.add(15,20);
float b=m.add(20,40,35.5f);
System.out.println("result of 2 nos="+a);
System.out.println("result of 3 nos="+b);
}
}