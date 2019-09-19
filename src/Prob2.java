import java.util.*;
import java.io.*;

public class Prob2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        powe(n);
    }
    public static void powe(int n)
    {
        if (n==4)
        {
            System.out.print("Power of 4");
        }
        else  if(n%4!=0)
        {
            System.out.print("Not a power of 4");
        }
        else if(n%4==0&& n!=4)
        {
            powe(n/4);
        }
    }
}