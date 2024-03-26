import java.util.*;
class student1{
String name;
int regno,total=0,avg=0;
int marks[]=new int[5];
  
student1(String a,int b,int c[])
{
name=a;
regno=b;
marks=c;
}
void calculate()
{
for(int i=0;i<5;i++)
{
total+=marks[i];}
avg=total/5;
}
void display()
{
System.out.println("name="+name);
System.out.println("regno="+regno);
System.out.println("average marks"+avg);
}
public static void main(String str[]){
Scanner s=new Scanner(System.in);
String x;
int y;
int z[]=new int[5];
System.out.println("enter the name");
x=s.nextLine();
System.out.println("enter regno");
y=s.nextInt();

for(int i=0;i<5;i++)
{
System.out.println("enter the marks"+(i+1));
z[i]=s.nextInt();
}
student1 obj=new student1(x,y,z);

obj.calculate();
obj.display();
}
}
