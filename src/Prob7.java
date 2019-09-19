import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class Prob7 {

    private String firstName;
    private String lastName;
    private Float salary;
    private int age;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String Name() {

        return firstName + " " + lastName;

    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getSalary() {
        return salary;
    }

    public void age(int age) {
        if(age>=0 && age<=100) {

                this.age = age;
            }
            else
            {
                System.out.println("You are immortal");

            }
        }
        public void isValid()
        {
            if(age>=18 && age<=60)
            {
                System.out.println("Age of employee");
            }
            else
            {
                System.out.println("Not an employee age");
            }
        }


       public int getAge() {
        return age;
       }

}
