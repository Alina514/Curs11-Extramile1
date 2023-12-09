package extramile1;

public class Car {
    private String name;
    private Integer age;
    private Double km;
    private Double price;

    public Car(String name, Integer age, Double km, Double price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getKm() {
        return km;
    }

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return "This car is  " + name + " from " + age + ". Has " + km + " km and cost " + price + " euro";
    }

    public void add(Car car) {

    }
}
