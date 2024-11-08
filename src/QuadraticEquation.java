public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() {
        double delta =  Math.pow(this.b,2) - 4 * this.a * this.c;
        if (delta > 0) {
            double a = getRoot1();
            double b = getRoot2();
            System.out.println("Root 1 " + a + "\n"+ "Root 2 " + b);
        } else if (delta == 0) {
            double a = getRoot1();
            System.out.println("Double root " + a);
        } else {
            System.out.println("The equation has no solution");
        }
    }
    public double getRoot1() {
        double root1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        return root1;
    }
    public double getRoot2() {
        double roo2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        return roo2;
    }

}
