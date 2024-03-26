import java.util.*;
import java.lang.*;
class websitetype
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String url=sc.nextLine();
int i=url.indexOf(":");
String str=url.substring(0,i);
if(str.equals("http"))
{
System.out.println("hyper text transfer protocol");
}
else if(str.equals("ftp"))
{
System.out.println("file transfer protocol");
}
else{
System.out.println("it is not a correct protocol");
}

int j=url.lastIndexOf(".");
int length=url.length();
String str=url.subtring(j+1);
if(str2.equals("com"))
{
System.out.println("commercial");
}
else if(str2.equals("net"))
{
System.out.println("network");
}
else
{
System.out.println("it is not in correct ");
}
}
}