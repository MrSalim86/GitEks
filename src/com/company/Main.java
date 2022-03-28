package com.company;

public class Main {

    public static void main(String[] args) {
        FleetOfCars fleetOfCars= new FleetOfCars();

        DieselCar Toyata = new DieselCar("DB25754", "Toyota", "RAV4",
                                       5, 22, true );

        GasolineCar BMW = new GasolineCar("CV75123","BMW", "316i",
                                             3, 17);

        ElectricCar Tesla = new ElectricCar("ZX45712","Tesla","X",
                                             4,100,565);
        fleetOfCars.addCars(Toyata);

        fleetOfCars.addCars(BMW);

        fleetOfCars.addCars(Tesla);

        System.out.println(fleetOfCars);

        System.out.println("Total amount : " + fleetOfCars.getTotalRegistrationFeeForFleet());
    }

}
