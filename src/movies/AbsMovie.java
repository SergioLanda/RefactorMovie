package movies;

/**
 * Created by SergioLanda on 8/23/2016.
 */
public abstract class AbsMovie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public void set_title(String _title) {
        this._title = _title;
    }

    private String _title;

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    private int _priceCode;

    public int getPriceCode() {
        return _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public abstract double typeMovie(double thisAmount, Rental each);
}
