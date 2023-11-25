package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.Arrays;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(Model model) {
        model.addAttribute("cars", Arrays.asList(
                new Car("Subaru", 2002, 20000),
                new Car("Mazda", 2010, 21000),
                new Car("Kia", 2015, 24000),
                new Car("Honda", 2020, 30000),
                new Car("Toyota", 2023, 40000)
        ));
        return "cars";
    }

}
