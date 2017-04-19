import java.util.Comparator;

/**
 *
 */
public class Car {
    private String marka;
    private int year;
    private String color;
    private double cost;

    public Car(String marka, int year, String color, double cost) {
        this.marka = marka;
        this.year = year;
        this.color = color;
        this.cost = cost;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.cost, cost) != 0) return false;
        if (!marka.equals(car.marka)) return false;
        return color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = marka.hashCode();
        result = 31 * result + year;
        result = 31 * result + color.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
