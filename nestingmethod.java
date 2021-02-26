import java.io.*;
class nesting
{
int largest(int x,int y)
{
if(x>=y)
return(x);
else
return(y);
}
void display()
{
int l=largest(5,20);
System.out.print("largest value"+l);
}
}
class nestingmethod
{
public static void main(String[]args)
{
nesting n=new nesting();
n.display();
}
}