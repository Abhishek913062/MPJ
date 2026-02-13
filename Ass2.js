// Base Class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary(double updatedSalary) {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary Before Hike: " + salary);
        System.out.println("Salary After Hike: " + updatedSalary);
        System.out.println();
    }
}

// Derived Class 1
class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    double calculateSalary() {
        return salary + (salary * 0.50);  // 50% hike
    }
}

// Derived Class 2
class InternEmployee extends Employee {

    InternEmployee(String name, double salary) {
        super(name, salary);
    }

    double calculateSalary() {
        return salary + (salary * 0.25);  // 25% hike
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee("Rahul", 40000);
        double fullTimeNewSalary = f1.calculateSalary();
        f1.displaySalary(fullTimeNewSalary);

        InternEmployee i1 = new InternEmployee("Aman", 20000);
        double internNewSalary = i1.calculateSalary();
        i1.displaySalary(internNewSalary);
    }
}
