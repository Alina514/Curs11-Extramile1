package extramile1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarShop {
    private static List<Car> carList;
    private Map<String, Integer> carCountMap;
  

    public CarShop() {
        this.carList = new ArrayList<>();
        this.carCountMap = new HashMap<>();
    }

    public static void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void displayCars() {
        System.out.println("Cars in the shop:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public int getNumberOfCars(String carName) {
        return carCountMap.getOrDefault(carName, 2);
    }
}
