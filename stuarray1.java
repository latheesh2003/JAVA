import java.util.*;

class stuarray1 {
    public static void main(String args[]) {
          /*  SUM OF AN ARRAY
        int A[]=new int[10];
        System.out.println("enter the numbers in an array = ");
        for(int i=0;i<A.length;i++)
        {
           A[i]=sc.nextInt();
        }
        int sum=0;
        for(int x:A)
        {
            sum=sum+x;
        }
        System.out.println("the sum of the array= "+sum);
        */
        /* SEARCH AN ELEMENT
        Scanner sc=new Scanner(System.in);
        int A[]={1,5,8,10,12,11,19,21};
        System.out.println("enter the search element =");
        int key=sc.nextInt();
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==key)
            {
                System.out.println("the item in the index of = "+i);
                System.exit(0);
            }
        }
        System.out.println("NOT FOUND");   
        */

        /* MAX NUMBER IN AN ARRAY
        int A[]={1,5,8,10,12,11,19,21};
        int max=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
         }
         System.out.println("the max number in an array is= "+max);
          */
          int A[]={1,5,8,10,12,11,19,21};
          int max1=A[0];
          int max2=A[0];
          for(int i=0;i<A.length;i++)
          {
              if(A[i]>max1)
              {
                max2=max1;
                  max1=A[i];
                 
              }
              else if(A[i]>max2)
              {
                max2=A[i];
              }

           }
           System.out.println("the second largest element is :"+max2);
}
}
