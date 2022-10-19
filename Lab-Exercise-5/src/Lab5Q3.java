import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lab5Q3 {

    public static void main(String[] args){
        ArrayList<Car> car = new ArrayList<Car>();

        car.add(new Car("Toyota","Tundra",2018));
        car.add(new Car("Chevrolet","Cruze",2011));
        car.add(new Car("Nissan","Frontier",2017));
        car.add(new Car("Ford","Ranger",2013));
        car.add(new Car("GMC","Canyon",2019));

        System.out.println("Before:");

        for (Car c : car) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

        Collections.sort(car);

        System.out.println("After:");

        for (Car c : car) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

    }

}

class Car implements Comparable<Car>{
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car car) {
        return this.year - car.year;
    }

}

