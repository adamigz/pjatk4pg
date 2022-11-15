package com.example.pjatk4pg;

import com.example.pjatk4pg.model.Car;
import com.example.pjatk4pg.model.Engine;
import org.apache.coyote.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class Pjatk4pgApplication {

    @GetMapping("/getCars")
    public ResponseEntity<Car> getCars(){
        Engine v8 = new Engine(150, "2.5");
        Car ourCar = new Car("BMW", "czarny", v8, 2022);

        return ResponseEntity.ok(ourCar);
    }

    @PostMapping("/addCar")
    public ResponseEntity<String> addCar(@RequestBody Car car) {

        return ResponseEntity.ok("Samochód został dodany prawidłowo");
    }

    public static void main(String[] args) {

        SpringApplication.run(Pjatk4pgApplication.class, args);
    }

}
