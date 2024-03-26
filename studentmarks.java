import java.util.*;
 class student{
	public long roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	public int total()
	{
		return m1+m2+m3;
	}
	public float average()
	{
		return (m1+m2+m3)/3;
	}
	public String grade()
	{
		if(average()>60&&average()<100)
			return " garde = A";
		else
			return "garde = B";
	}
	public String details()
	{
		return "roll no.:"+roll+"\n"+"name"+name+"\n"+"course "+course+"\n";
	}
}
		
public class studentmarks
	{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	student m=new student();
	System.out.println("enter the roll number=");
	m.roll=sc.nextLong();
	System.out.println("enter the name=");
	m.name=sc.next();
	System.out.println("enter the course");
	m.course=sc.next();
	System.out.println("enter the marks=");
	m.m1=sc.nextInt();
	m.m2=sc.nextInt();
	m.m3=sc.nextInt();
	/*m.roll=123456789;
	m.name="latheesh";
	m.course="java";
	m.m1=90;
	m.m2=70;
	m.m3=85*/

	System.out.println(m.total());
	System.out.println(m.average());
	System.out.println(m.grade());
	System.out.println(m.details());
}
}