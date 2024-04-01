public class Main {
    public static void main(String[] args) {
        Point p = new Point(6, 8);

        Rectangle rect = new Rectangle(10, 15);
        System.out.println("площадь прямоугольника "+ rect.getArea());
    }
}

class Point{
    double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}