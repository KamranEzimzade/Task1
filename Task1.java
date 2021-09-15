
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static long carParkingRoof(List<Long> cars, int k) {
        long distance = Integer.MAX_VALUE;
        Collections.sort(cars);
        for (int i = 0; i <= cars.size() - k; i++) {

            distance = Math.min(distance, cars.get(k + i - 1) - cars.get(i));
        }

        distance++;

        return distance;
    }

    public static void main(String[] args) {
        List<Long> cars = Arrays.asList(6L, 2L, 12L, 7L);
        long r = carParkingRoof(cars, 3);
        System.out.println(r); 
    }
}
