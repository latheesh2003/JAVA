import java.util.Arrays;
import java.util.*;
class sortalphabetical
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
String a[]={"latheesh","alget","cat","banana","mpocket"};
System.out.println("enter the A or a for print in asscending order");
System.out.println("enter the Z or z for print in decending order order");
char order=sc.next().charAt(0);
Arrays.sort(a);
if(order=='A'|order=='a')
{
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
else if(order=='Z'|order=='z')
{
	for(int i=a.length-1;i>=0;i--)
{
System.out.println(a[i]);
}
}
else
	System.out.println("enter the correct character");
	}
	

}