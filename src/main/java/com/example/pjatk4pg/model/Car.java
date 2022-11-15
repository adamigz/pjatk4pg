package com.example.pjatk4pg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Car {
    private String mark;
    private String color;
    private Engine engine;
    private Integer productionYear;
}
