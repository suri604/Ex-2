public class memberclass extends Prob3 {
    public static void main(String [] args)
    {
        Prob3 m = new Prob3();
        m.setname("Harry");
        m.setage(30);
        m.setsalary(30000);
        System.out.println("Name is : " + m.getname());
        System.out.println("Age is : " + m.getage());
        System.out.println("Salary is : " + m.getsalary());
    }
}
