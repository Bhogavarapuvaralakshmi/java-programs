class lables1
{
public static void main(String[]args)
{
l1:for(int i=1;i<=10;i++)
{
System.out.println();
l2:for(int j=1;j<=10;j++)
{
System.out.print(j);
if(j==5)
break l1;
}
}
}
}
