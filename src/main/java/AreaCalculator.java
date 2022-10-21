import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the Square : ");
        double side = scanner.nextDouble();
        System.out.println("Square Area : " + calculateAreaOfSquare(side));
        System.out.print("Enter the radius of the Circle : ");
        double radius = scanner.nextDouble();
        System.out.println("Circle Area : " + calculateAreaOfCircle(radius));
        System.out.print("Enter the length of the Rectangle : ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the Rectangle : ");
        double breadth = scanner.nextDouble();
        System.out.println("Rectangle Area : " + calculateAreaOfRectangle(length, breadth));
    }
    public static double calculateAreaOfSquare(double side){
        return side * side;
    }
    public static double calculateAreaOfCircle(double radius){
        return 3.14 * radius * radius;
    }
    public static double calculateAreaOfRectangle(double length, double breadth){
        return length * breadth;
    }
}
