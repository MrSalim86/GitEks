package com.company;

public abstract class ACar implements Car {

    private String RegistrationNumber;
    private final String Make;
    private final String Model;
    private final int NumberOfDoors;


    public ACar(String RegistrationNumber, String Make, String Model, int NumberOfDoors) {

        this.RegistrationNumber = RegistrationNumber;
        this.Make = Make;
        this.Model = Model;
        this.NumberOfDoors = NumberOfDoors;

    }

    @Override
    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    @Override
    public String getMake() {
        return Make;
    }

    @Override
    public String getModel() {
        return Model;
    }

    @Override
    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    @Override
    public String toString() {
        return "\nACar{" + "RegistrationNumber=:" + RegistrationNumber + " " + " Make=:" + Make + " " +
                " Model=:" + Model + " " + " NumberOfDoors=:" + NumberOfDoors;
    }
}

