

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Петр Петров", "Программист", "+7 (987) 234-56-78", 40000, 40);
        employees[1] = new Employee("Анна Сидорова", "Бухгалтер", "+7 (987) 345-67-89", 35000, 50);
        employees[2] = new Employee("Ольга Козлова", "Менеджер", "+7 (987) 456-78-90", 30000, 55);
        employees[3] = new Employee("Дмитрий Егоров", "Аналитик", "+7 (987) 567-89-01", 45000, 30);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
        System.out.println("===========");

        increaseSalary(employees, 45, 5000);

        for (Employee employee : employees) {
            employee.printInfo();

            System.out.println();
        }
        System.out.println("===========");

        Employee.increaseSalary(employees);

        for (Employee employee : employees) {
            employee.printInfo();

            System.out.println();
        }
        System.out.println("===========");

        Employee[] employees2 = new Employee[6];
        employees2[0] = new Employee("Иван Иванов", "Руководитель", "+7 (987) 123-45-67", 50000, 35);
        employees2[1] = new Employee("Петр Петров", "Программист", "+7 (987) 234-56-78", 40000, 40);
        employees2[2] = new Employee("Анна Сидорова", "Бухгалтер", "+7 (987) 345-67-89", 35000, 50);
        employees2[3] = new Employee("Ольга Козлова", "Менеджер", "+7 (987) 456-78-90", 30000, 55);
        employees2[4] = new Employee("Дмитрий Егоров", "Аналитик", "+7 (987) 567-89-01", 45000, 30);
        employees2[5] = new Supervisor("Елена Петрова", "Генеральный директор", "+7 (987) 678-90-12", 100000, 45);

        Supervisor.increaseSalary(employees2, 45, 5000);

        for (Employee employee : employees2) {
            employee.printInfo();
            System.out.println();
        }
        System.out.println("===========");

        System.out.println("Средний возраст сотрудников: " + Employee.calculateAverageAge(employees));
        System.out.println("Средняя зарплата сотрудников: " + Employee.calculateAverageSalary(employees));
    }


    public static void increaseSalary(Employee[] employees, int ageLimit, double raiseSalary) {
        for (Employee employee : employees) {
            if (employee.age > ageLimit) {
                employee.salary += raiseSalary;
            }
        }
    }


}
