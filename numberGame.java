import java.util.*;
import java.util.Random;

class numberGame
{
    public static  void main(String args[])
    {
        int attempts=5;
        boolean play=true;
        int count=0;

        Scanner sc=new Scanner(System.in);
        int targetnum=new Random().nextInt(100);
        System.out.println("enter the guess You have exactly  ".toUpperCase()+attempts+"  attempts".toUpperCase());
        while(play==true)
        {
        for(int i=1;i<=attempts;i++)
        {
            System.out.println("attempt "+i +" enter the number: between 0 to 99");
            int guessnum=sc.nextInt();
            if(targetnum==guessnum)
            {
                System.out.println("your guess is correct!");
                count++;
            }
             else if(targetnum<guessnum)
            {
                System.out.println("your guess to high!"); 
            }
            else if(targetnum>guessnum)
            {
            System.out.println("your guess too low!");
            }
        
            if(i==attempts)
           {
            System.out.println("your attemps has been completed:");
            System.out.println("did you want to play again yes/no : ");
            String again=sc.next();
            if(again.equals("no"))
             {
            play=false;
             }
           else if(again.equals("yes"))
            {    
            play=true;
            }
          }
        }
    }
    System.out.println("your final score is "+count);
    if(count>=1)
    {
    System.out.println("Congratulation and Thankyou for PLAYING!");
    }
    else 
    {
        System.out.println("you lost the match");
    }
    sc.close();

}

}