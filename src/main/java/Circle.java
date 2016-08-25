/**
 * Created by SergioLanda on 8/24/2016.
 */
public class Circle extends Figure {

    double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radio, 2);

    }

    public double calculatePerimeter() {
        return Math.PI * 2 * radio;

    }
}
