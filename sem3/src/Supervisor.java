public class Supervisor extends Employee {


    public Supervisor(String fullName, String position, String phoneNumber, double salary, int age) {
        super(fullName, position, phoneNumber, salary, age);
    }

    public static void increaseSalary(Employee[] employees, int ageLimit, double raiseSalary) {
        for (Employee employee : employees) {
            if (!(employee instanceof Supervisor) && employee.age > ageLimit) {
                employee.salary += raiseSalary;
            }
        }
    }
}

