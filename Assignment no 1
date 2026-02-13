class Student {
    String name;
    int age;
    double marks;

    // Constructor
    Student(String n, int a, double m) {
        name = n;
        age = a;
        marks = m;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    // Method that returns grade
    String getGrade() {
        if (marks >= 75)
            return "Distinction";
        else if (marks >= 60)
            return "First Class";
        else if (marks >= 40)
            return "Pass";
        else
            return "Fail";
    }
}

public class Main {
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student("Rahul", 20, 82.5);

        // Calling methods
        s1.displayInfo();
        System.out.println("Grade: " + s1.getGrade());
    }
}
