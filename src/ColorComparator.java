import java.util.Comparator;

/**
 * Created by Asus on 11.04.2017.
 */
public class ColorComparator implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }

}
