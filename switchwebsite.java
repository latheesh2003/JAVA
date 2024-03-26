import java.util.*;
import java.lang.*;
class switchwebsite1
{
public static void main(String args[])
{
String domain="google.com";
int i=domain.lastIndexOf(".");
int length=domain.length();
String exten=domain.substring(i+1,length);
switch(exten)
{
case "com":
System.out.println("commercial");
break;
case "org":
System.out.println("organization");
break;
case "net":
System.out.println("network");
break;
case "gov":
System.out.println("government");
break;
default:
System.out.println("not an extension");
break;
}
}
