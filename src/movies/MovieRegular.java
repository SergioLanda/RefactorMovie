package movies;

/**
 * Created by SergioLanda on 8/23/2016.
 */
public class MovieRegular extends AbsMovie {

    @Override
    public double typeMovie(double thisAmount, Rental each) {
        thisAmount += 2;
        if (each.getDaysRented() > 2)
            thisAmount += (each.getDaysRented() - 2) * 1.5;
        return thisAmount;
    }

}
