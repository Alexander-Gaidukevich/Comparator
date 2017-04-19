import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class Runner {
    public static void main(String[] args) {

        Flower flower1 = new Flower("flor1", "Red", 150);
        Flower flower2 = new Flower("flor5", "Blue", 550);
        Flower flower3 = new Flower("flor9", "White", 30);
        Flower flower4 = new Flower("flor4", "Black", 990);


        List<Flower> flowerList = new ArrayList<Flower>();
        flowerList.add(flower1);
        flowerList.add(flower2);
        flowerList.add(flower3);
        flowerList.add(flower4);

        System.out.println(flowerList);

        Collections.sort(flowerList);

        System.out.println(flowerList);

        Car car1 = new Car("BMV", 1980, "Red", 7800);
        Car car2 = new Car("VNS", 2000, "Black", 2500);
        Car car3 = new Car("KUY", 1938, "Yellow", 3600);
        Car car4 = new Car("QER", 2017, "Green", 7500);

        List<Car> carList = new ArrayList<Car>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println(carList);

        Comparator comparator = new YearComparator();
        Collections.sort(carList, comparator);
        System.out.println("=======================================");
        System.out.println(carList);

        Comparator comparator1 = new ColorComparator();
        Collections.sort(carList, comparator1);
        System.out.println("=======================================");
        System.out.println(carList);

    }
}
