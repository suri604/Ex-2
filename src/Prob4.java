import java.util.*;
import java.io.*;
public class Prob4 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(isEven(n));
    }
    public static boolean isEven(int n){
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}