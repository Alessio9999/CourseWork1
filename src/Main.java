import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            double salary = 100_000 + 200_000 * random.nextDouble();
            employees[i] = new Employee("name_" + i, salary, random.nextInt(1, 6));
        }
        System.out.println("\nCписок всех сотрудников со всеми имеющимися по ним данными:");
        printAll(employees);
        System.out.printf("\nCумма затрат на зарплаты в месяц: %.2f руб.", getSalariesSum(employees));
        System.out.println("\n\nCотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary(employees));
        System.out.println("\nCотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary(employees));
        System.out.printf("\nСредняя зарплата: %.2f руб.", getAverageSalary(employees));
        System.out.println("\n\nФ. И. О. всех сотрудников:");
        printAllNames(employees);
    }


    public static void printAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printAllNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static double getSalariesSum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static double getAverageSalary(Employee[] employees) {
        return getSalariesSum(employees) / employees.length;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minEmployee == null || minEmployee.getSalary() > employee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (maxEmployee == null || maxEmployee.getSalary() < employee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }


}