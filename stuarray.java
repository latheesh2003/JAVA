import java.util.*;

class stuarray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int A[]={1,5,8,10,12,11,19,21};
        System.out.println("Enter the search element:");
        int key=sc.nextInt();
        for(int i=0;i<A.length;i++) {
            if(A[i]==key) {
                System.out.println("The item is at index: "+i);
                System.exit(0);
            }
        }
        System.out.println("NOT FOUND");   
    }
}
