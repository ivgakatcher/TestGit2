public class Triangle {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static double calcPerimeter(double a, double b, double c){
        return a+b+c;
    }
    public double calcArea(){
        double p= calcPerimeter(a,b,c)/2;
        return Math.sqrt (p*(p-a)*(p-b)*(p-c));
    }
}
