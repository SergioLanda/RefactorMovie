/**
 * Created by SergioLanda on 8/25/2016.
 */
public class Rectangle extends Figure {
    double height;
    double width;

    public Rectangle(double heigth,double width){
        this.height=heigth;
        this.width=width;
    }

    public double calculateArea() {
        return this.height * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (height + this.width);
    }
}
