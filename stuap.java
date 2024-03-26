import java.util.*;
class stuap
{
public static void main(String args[])
{
    /* 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,d and n value");
    int a=sc.nextInt();
    int d=sc.nextInt();
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.print(a+", ");
        a=a+d;
    }*/
    /* 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,r and n value");
    int a=sc.nextInt();
    int r=sc.nextInt();
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.print(a+", ");
        a=a*r;
    }*/
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=1;
    System.out.println("enter the range: ");
    int n=sc.nextInt();
    System.out.print(a+",");
    System.out.print(b+",");
    for(int i=1;i<=n-2;i++)
    {
        int c=a+b;
        System.out.print(c+",");
        a=b;
        b=c;
    }

}
}