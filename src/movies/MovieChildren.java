package movies;

/**
 * Created by SergioLanda on 8/23/2016.
 */
public class MovieChildren extends AbsMovie {

    @Override
    public double typeMovie(double thisAmount, Rental each) {
        thisAmount += 1.5;
        if (each.getDaysRented() > 3)
            thisAmount += (each.getDaysRented() - 3) * 1.5;
        return thisAmount;
    }

}
