import java.util.Objects;

public class Employee {
    private String fullName;
    private double salary;
    private int department;
    private final int id;
    private static int COUNTER = 1;

    public Employee(String fullName, double salary, int department) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = COUNTER++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "fullName='" + fullName + '\'' +
                ", salary=" + String.format("%.2f руб.",salary) +
                ", department=" + department +
                ", id=" + id + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department, id);
    }
}
