import java.util.*;
class stuarmstrong
{
    public static void main(String args[])
    {
        /* DISPLAY THE DIGITS OF A NUMBER
        int n=257;
        while(n>0)
        {
            int r=n%10;
             n=n/10;
            System.out.println(r);
        }*/
        /* COUNT DIGITS OF A NUMBER
        int count=0;
        int n=257;
        while(n>0)
        {
            int r=n%10;
             n=n/10;
             count++;
            System.out.println(r);
        }
        System.out.println("the number of digits = "+count);
*/
/* FIND THE NUMBER IS ARMSTRONG OR NOT
Scanner sc=new Scanner(System.in);
System.out.print("enter the number = ");
int n=sc.nextInt();
int temp=n;
int armstrong=0;
while(n>0)
{
    int r=n%10;
    n=n/10;
    armstrong= armstrong+(r*r*r);
}
System.out.println( armstrong);
if(temp== armstrong)
{
    System.out.println("it is an armstrong number");
}
else{
    System.out.println("it is not a armstrong number ");
}*/
/*REVERSE OF A NUMBER
Scanner sc=new Scanner(System.in);
System.out.print("enter the number = ");
int n=sc.nextInt();
while(n>0)
{
    int r=n%10;
    n=n/10;
System.out.print(r);
}*/
Scanner sc=new Scanner(System.in);
System.out.print("enter the number = ");
int n=sc.nextInt();
int temp=n;
int rev=0;
while(n>0)
{
    int r=n%10;
    rev=rev*10+r;
    n=n/10;

}
System.out.print("reverse of number is = " +rev);
if(rev==temp)
System.out.print("it is a palindrome");
else
System.out.print("it is not a palindrome");
    }
}