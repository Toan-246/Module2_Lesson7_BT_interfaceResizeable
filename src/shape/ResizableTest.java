package shape;

import resizableShape.Resizeable;

import java.util.Scanner;

public class ResizableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle cir1 = new Circle(3, "red", true);
        Rectangle rec1 = new Rectangle(2, 5);
        Square squ1 = new Square(6, "blue", false);
        Resizeable[] arr = new Resizeable[]{cir1, rec1, squ1};

        System.out.println("Pre-resize:");
        for (Resizeable resizable: arr){
            System.out.println(resizable);
        }

        System.out.print("Enter new size(%): ");
        double percent = scanner.nextDouble();
        for (Resizeable resizable : arr) {
            resizable.resize(percent);
        }

        System.out.println("After-resize:");
        for (Resizeable resizable: arr){
            System.out.println(resizable);
        }

    }
}
