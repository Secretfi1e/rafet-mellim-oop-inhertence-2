public class Employee extends Human {
    double position;
    String salary;

    public Employee(String fullName, int age, double position, String salary) {
        super(fullName, age);
        this.position=position;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Position='" + position + '\'' +
                ", Salary=" + salary +
                ", FullName='" + fullName + '\'' +
                ", Age=" + age +
                '}';
    }
}

