package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }


//    private List<Car> carList = new ArrayList<>() {
//        {
//            add (new Car(1, "auto1", "black"));
//            add (new Car(2, "auto2", "white"));
//            add (new Car(3, "auto3", "blue"));
//            add (new Car(4, "auto4", "yellow"));
//            add (new Car(5, "auto5", "grey"));
//
//        }
//    };
//
//    @Override
//    public List<Car> getCarList(int count) {
//        return carList.stream().limit(count).toList();
//    }
}
