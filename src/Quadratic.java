import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the first number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the first number c: ");
        int c = sc.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.solve();
    }
}
