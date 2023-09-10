public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bryan", 21, 30000);
        Employee employee2 = new Employee("Kyaw Zaw Han", 21, 20000);
        Employee employee3 = new Employee();
        employee3.Name = "Han";
        employee3.Salary = 25000;

        System.out.println("The name of employee1 is " + employee1.Name);
        System.out.println("The name of employee2 is " + employee2.Name);
        System.out.println("The name of employee3 is " + employee3.Name);
        System.out.println("The Salary of employee1 is " + employee1.Salary);


    }
}
