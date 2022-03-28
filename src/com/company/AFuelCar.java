package com.company;

public abstract class AFuelCar extends ACar {
    private int KmPrLitre;

    public AFuelCar(String RegistrationNumber, String Make, String Model, int NumberOfDoors, int kmPrLitre) {
        super(RegistrationNumber, Make, Model, NumberOfDoors);
        this.KmPrLitre = kmPrLitre;

    }
    public abstract String getFuelType();
    public int  kmPrLitre(){
        return KmPrLitre;

    }
    public int getDefaultRegistrationFee() {

        if (this.kmPrLitre() <= 50 && this.kmPrLitre() >= 20) {
            return 330;
        }
        if (this.kmPrLitre() <= 20 && this.kmPrLitre() >= 15) {
            return 1050;
        }
        if (this.kmPrLitre() <= 15 && this.kmPrLitre() >= 10) {
            return 2340;
        }
        if (this.kmPrLitre() <= 5) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "AFuelCar{" + "KmPrLitre=" + KmPrLitre + "} " + super.toString();
    }
}

