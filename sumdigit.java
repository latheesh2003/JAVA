import java.util.*;
class sumdigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int sum=0;
while(number>0)
{
rem=number%10;
sum=sum+rem;
number=number/10;
}
}
}