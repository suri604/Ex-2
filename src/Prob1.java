import java.util.*;
import java.io.*;

public class Prob1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =n;
        int Rev =rev(n);
        if(num==Rev)
        {
            System.out.print("palindrome number");
        }
        else
        {
            System.out.print("Not a palindrome number");
        }
    }
    public static int rev(int n)
    {
        int rem;
        int rev =0;
        while(n>0)
        {
            rem = n%10;
            rev = rev*10 +rem;
            n=n/10;
        }
        return rev;
    }

}