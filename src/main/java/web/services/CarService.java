package web.services;

import web.model.Car;

import java.util.List;

public interface CarService {

    //Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.

    public List<Car> getCar(Integer limit);
}
