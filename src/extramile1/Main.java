package extramile1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop();

         CarShop.addCar(new Car("VW", 2019, 40.000, 65.000));
         carShop.addCar(new Car("Ford", 2023, 5.000, 80.000));
         carShop.addCar(new Car("BMW", 2020, 160.000, 10.000));
        CarShop.addCar(new Car("VW", 2019, 40.000, 65.000));

        carShop.displayCars();


        String carNameToCheck = "VW";
        int numberOfCars = carShop.getNumberOfCars(carNameToCheck);
        System.out.println("Number of " + carNameToCheck + " cars in the shop: " + numberOfCars);
    }
}