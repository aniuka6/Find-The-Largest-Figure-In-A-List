import java.util.ArrayList;

public class Figury {

    double a;
    double b;
    double c;
    double r;
    double perimeter;
    double area;

    static class Square extends Figury {
        public Square(double a) {
            this.a = a;
            this.area = (a * a);
            this.perimeter = (4 * a);
            return;
        }
    }

    static class Circle extends Figury {
        public Circle(double r) {
            this.area = (3.14 * r * r);
            this.perimeter = (2 * 3.14 * r);

        }
    }

    static class Rectangle extends Figury {
        public Rectangle(double b, double c) {
            this.b = b;
            this.c = c;
            this.area = (b * c);
            this.perimeter = ((2 * b) + (2 * c));
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public static void LargestFigure(ArrayList<Figury> figures) {
        double largest = 0;
        int index = 0;
        for (int i = 0; i < figures.size(); i++) {
            if (largest < figures.get(i).getArea()) {
                largest = figures.get(i).getArea();
            }
        }
        System.out.println("Największe pole powierzchni: " + largest);
    }

    public static void LargestPerimeter(ArrayList<Figury> figures) {
        double largest = 0;
        int index = 0;
        for (int i = 0; i < figures.size(); i++) {
            if (largest < figures.get(i).getPerimeter()) {
                largest = figures.get(i).getPerimeter();
            }
        }
        System.out.println("Największe obwód: " + largest);
    }
}
