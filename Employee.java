public class Employee{
    public String name;
    public String address;
    public int number;
    public int NSSFNO;
    public double salary;
    public void mailCheck()
    {
        System.out.println("Mailing check to " + name + "/n" + address);

    }
    public double computePay()
    {
        return salary/52;
    }
}