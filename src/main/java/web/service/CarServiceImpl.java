package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private List<Car> carList = new ArrayList<>() {
        {
            add (new Car(1, "auto1", "black"));
            add (new Car(2, "auto2", "white"));
            add (new Car(3, "auto3", "blue"));
            add (new Car(4, "auto4", "yellow"));
            add (new Car(5, "auto5", "grey"));

        }
    };

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
