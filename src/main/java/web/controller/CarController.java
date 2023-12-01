package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(Model model, @RequestParam(required = false) Integer count) {

        count = (count == null) || count > 5 || count <= 0 ? 5 : count;

        List<Car> carsSet = Arrays.asList(new Car("Subaru", 2002, 20000),
                new Car("Mazda", 2010, 21000),
                new Car("Kia", 2015, 24000),
                new Car("Honda", 2020, 30000),
                new Car("Toyota", 2023, 40000));


        model.addAttribute("mesage", "Hello, count is - " + count);
        // model.addAttribute("cars", carsSet.subList(0, count));

        model.addAttribute("cars", carsSet.stream().limit(count).toList());

        return "cars";
    }

}///cars?count=2
