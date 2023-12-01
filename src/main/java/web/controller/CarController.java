package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarServiceImpl;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(Model model, @RequestParam(required = false) Integer count) {

        count = (count == null) || count > 5 || count <= 0 ? 5 : count;

        model.addAttribute("mesage", "Hello, count is - " + count);

        model.addAttribute("cars", new CarServiceImpl().getCar(count));

        return "cars";
    }

}///cars?count=2
