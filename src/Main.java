import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of employees:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();
        Employee[] employeeList = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            if (employeeList[i] == null) {
                employeeList[i] = addEmployee();
            }
        }
        System.out.println("filterlemek isteyirsen?  Y -a bas, istemirsen digerine:");
        String userChoice = scanner.nextLine();
        if (Objects.equals(userChoice, "Y") || Objects.equals(userChoice, "y")) {
            System.out.println("Enter searched name");
            String searchInput = scanner.nextLine();
            filterList(employeeList, searchInput);
        } else {
            printList(employeeList);
        }

    }

    public static Employee addEmployee() {
        System.out.println("Enter employee full name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter employee age:");
        int age = scanner.nextInt();
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter employee position:");
        String position = scanner.nextLine();

        return new Employee(fullName, age, salary, position);
    }

    public static void printList(Employee[] list) {
        for (Employee emp : list) {
            System.out.println(emp.toString());
        }
    }

    public static void filterList(Employee[] list, String searchedValue) {
        boolean isFound = false;
        for (Employee emp : list) {
            if (emp.fullName.toLowerCase().contains(searchedValue.toLowerCase())) {
                isFound = true;
                System.out.println(emp.toString());
            }
        }

        if (!isFound) {
            System.out.println("Nothing was found!");
        }
    }
}



