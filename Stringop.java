class Stringop
{
public static void main(String[]args)
{
String s1=new String("object oriented programm");
String s2=s1.toUpperCase();
System.out.println("upper case string="+s2);
String s3=s1.toLowerCase();
System.out.println("lower case string="+s3);
String s4=s1.replace('e','#');
System.out.println("replace a character in a String="+s4);
String s5=s1.trim();
System.out.println("remove white spaces from a string="+s5);
if(s1.equals(s2))
System.out.println("s1 and s2 are equal");
else 
System.out.println("s1 and s2 are not equal");
int len=s1.length();
System.out.println("length of s1="+len);
char x=s1.charAt(16);
System.out.println("character at 16 position in s1="+x);
if(s1.compareTo(s2)>0)
System.out.println("s1 is bigger than s2");
else
if(s1.compareTo(s2)<0)
System.out.println("s1 is smaller than s2");
else
if(s1.compareTo(s2)==0)
System.out.println("s1 is equal to s2");
String s6=s1.concat(s2);
System.out.println("s2 add at end of s1="+s6);
String s7=s1.substring(1);
System.out.println("Substring="+s7);
}
}