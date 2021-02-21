import java.util.*;
class addition1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int i,j;
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
System.out.println("enter four elements");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("enter four elements");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{b[i][j]=s.nextInt();
}
}
System.out.println("addition of two matrices are");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}