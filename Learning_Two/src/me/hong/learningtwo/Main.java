package me.hong.learningtwo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ParentClass> vehicleList = new ArrayList<>();
        vehicleList.add(new SubClass());
        vehicleList.add(new SubClass2());

        System.out.println(vehicleList.get(0).getColors());
        System.out.println(vehicleList.get(1).getWheels());

    }
}
