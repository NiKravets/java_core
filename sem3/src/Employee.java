public class Employee {

    private String fullName;
    private String position;
    private String phoneNumber;
    double salary;
    int age;



    public Employee(String fullName, String position, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("ФИО: %s\nДолжность: %s\nТелефон: %s\nЗарплата: %s\nВозраст: %s\n"
                ,fullName,position,phoneNumber,salary,age);
        System.out.println();
    }

    public static void increaseSalary(Employee[] employees) {
        int ageLimit = 45;
        double raiseSalary = 5000;
        for (Employee employee : employees) {
            if (employee.age > ageLimit) {
                employee.salary += raiseSalary;
            }
        }
    }

    public static double calculateAverageAge(Employee[] employees) {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.age;
        }
        return (double) totalAge / employees.length;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }
        return totalSalary / employees.length;
    }


}
