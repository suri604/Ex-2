import java.util.*;
import java.io.*;
public class Prob5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A =new int [n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        float  a;
        int b,c;
        a = avg(A,n);
        b= min(A,n);
        c = max(A,n);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    public static float avg(int A[],int n)
    {
        float avg;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum =sum+A[i];
        }
        avg =sum/n;
        return avg;
    }
    public static int min (int A[], int n)
    {
        Arrays.sort(A);
        return A[0];

    }
    public static int max (int A[], int n)
    {

        Arrays.sort(A);
        return A[n-1];

    }
}