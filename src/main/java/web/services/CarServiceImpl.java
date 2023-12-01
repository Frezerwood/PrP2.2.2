package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;

import java.util.Arrays;
import java.util.List;


public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(Integer limit) {

        List<Car> carsSet = Arrays.asList(new Car("Subaru", 2002, 20000),
                new Car("Mazda", 2010, 21000),
                new Car("Kia", 2015, 24000),
                new Car("Honda", 2020, 30000),
                new Car("Toyota", 2023, 40000));


        return carsSet.stream().limit(limit).toList();
    }
}
