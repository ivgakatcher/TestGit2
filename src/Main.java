public class Main {
    public static void main(String[] args) {
        Point p = new Point(6, 8);
        Rectangle rect = new Rectangle(10, 15);
        System.out.println("площадь прямоугольника "+ rect.getArea());
        Triangle tri = new Triangle(3, 4,5);
        System.out.println("площадь треугольника "+ tri.calcArea());
    }
}

class Point{
    double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}