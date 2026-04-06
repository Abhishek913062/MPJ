class Shape {

    // Overloaded methods (Area calculation)
    double area(double side) {
        return side * side; // square
    }

    double area(double length, double breadth) {
        return length * breadth; // rectangle
    }

    double area(double radius, boolean isCircle) {
        return 3.14 * radius * radius; // circle
    }

    // Method to override
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1
class Rectangle extends Shape {

    @Override
    void display() {
        System.out.println("This is a Rectangle.");
    }
}

// Subclass 2
class Circle extends Shape {

    @Override
    void display() {
        System.out.println("This is a Circle.");
    }
}

// Subclass 3
class Triangle extends Shape {

    @Override
    void display() {
        System.out.println("This is a Triangle.");
    }
}

public class AdvancedPolymorphism {

    public static void main(String[] args) {

        Shape s = new Shape();

        System.out.println("---- METHOD OVERLOADING ----");
        System.out.println("Square Area: " + s.area(4));
        System.out.println("Rectangle Area: " + s.area(5, 3));
        System.out.println("Circle Area: " + s.area(2.5, true));

        System.out.println("\n---- METHOD OVERRIDING ----");

        Shape obj;

        obj = new Rectangle();
        obj.display();

        obj = new Circle();
        obj.display();

        obj = new Triangle();
        obj.display();

        System.out.println("\n---- RUNTIME POLYMORPHISM ----");

        Shape ref = new Circle();
        ref.display(); // runtime decision

        System.out.println("\nProgram Completed.");
    }
}
