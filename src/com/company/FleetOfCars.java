package com.company;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<ACar>Cars = new ArrayList<>();

    public void addCars(ACar car){
        Cars.add(car);
    }

    @Override
    public String toString() {
        return "FleetOfCars{" + "CarType" + Cars + '}';
    }
    public int  getTotalRegistrationFeeForFleet(){
      int total = 0;
        for (ACar car : Cars) {
            System.out.println(car.getRegistrationFee());
            total += car.getRegistrationFee();
        }
        return total;

    }
}
