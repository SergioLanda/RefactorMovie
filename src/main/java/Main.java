/**
 * Created by SergioLanda on 8/24/2016.
 */

public class Main {
    public static void main(String[] args) {
        Figure figure;
        figure = new Cuadrado(2);
        System.out.println("area cuadrado");
        System.out.println(figure.calculateArea());
        System.out.println("perimetro cuadrado");
        System.out.println(figure.calculatePerimeter());

        figure = new Circle(4);
        System.out.println("area circulo");
        System.out.println(figure.calculateArea());
        System.out.println("perimetro circulo");
        System.out.println(figure.calculatePerimeter());

        figure = new Rectangle(2,4);
        System.out.println("area rectangle");
        System.out.println(figure.calculateArea());
        System.out.println("perimetro rectangle");
        System.out.println(figure.calculatePerimeter());
    }
}
