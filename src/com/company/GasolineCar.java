package com.company;

public class GasolineCar extends AFuelCar {

    public GasolineCar(String RegistrationNumber, String Make, String Model, int NumberOfDoors, int kmPrLitre) {
        super(RegistrationNumber, Make, Model, NumberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "FuelType Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        if(kmPrLitre() < 5)
        {
            return 10470;
        }
        if(kmPrLitre() < 10)
        {
            return 5500;
        }
        if(kmPrLitre() < 15)
        {
            return 2340;
        }
        if(kmPrLitre() < 20)
        {
           return  1050;
        }
            return 330;

        //return getDefaultRegistrationFee();
    }

    @Override
    public String toString() {
        return "\n"+ getFuelType() + " " + super.toString();
    }
}
