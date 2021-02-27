class add
{
add(int a,int b)
{
System.out.println(a+b);
}
add(int a,int b,int c)
{
System.out.println(a+b+c);
}
}
class overloading
{
public static void main(String[]args)
{
add m=new add(30,20);
add m1=new add(25,40,40);
}
}