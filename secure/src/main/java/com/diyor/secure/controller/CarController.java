package com.diyor.secure.controller;

import com.diyor.secure.model.Car;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class CarController {
    private List<Car> cars = new ArrayList<>(Arrays.asList(
       new Car(12, "Porch", "Green"),
       new Car(1, "Matiz" ,"White"),
       new Car(2, "Cobalt", "Black")
    ));

    @GetMapping("/cars")
    public List<Car> getCars() {
    return cars;
    }

    @PostMapping("/car")
    public Car addCar(@RequestBody Car car) {
        cars.add(car);
        return car;
    }
    @GetMapping("/csrf")
    public CsrfToken  getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");

    }



}
