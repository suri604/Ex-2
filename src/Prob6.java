import java.sql.SQLOutput;
import java.util.*;


public class Prob6 {


    public static void fact(long n)
    {
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println("The factorial of "+i+" is "+fact);

        }
    }




  public static void main(String [] args)
  {   Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number:");
      long n=sc.nextInt();

      if(n<21)
      {
          fact(n);
      }
      else {
          fact(20);
          System.out.println("The number is out bound");
      }
  }

}
