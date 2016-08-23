package movies;

/**
 * Created by SergioLanda on 8/23/2016.
 */
public class MovieNewRealease extends AbsMovie {

    @Override
    public double typeMovie(double thisAmount, Rental each) {
        thisAmount += each.getDaysRented() * 3;
        return thisAmount;
    }

}
