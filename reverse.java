import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int len=str.length();

for(int i=len-1;i>=0;i--)
{
System.out.print(str.charAt(i));
}
}
}
