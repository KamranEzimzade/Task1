
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


"Let's get done with it already"


public class Task1 {

    // In the line below a List of numbers with the Long type and "int k" which is the number of cars needs to be covered by the roof is being sent to the function as an argument
    
    public static long carParkingRoof(List<Long> cars, int k) {
        long distance = Integer.MAX_VALUE;
        
        
        // In the line below with collection.sort() function number of cars(which is 4 cars in this case) is being sorted in ascending order
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
