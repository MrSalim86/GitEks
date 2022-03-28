package com.company;

public class DieselCar extends AFuelCar {
    public boolean hasParticleFilter;

    public DieselCar(String RegistrationNumber, String Make, String Model, int NumberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(RegistrationNumber, Make, Model, NumberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }
    @Override
    public String toString() {
        return super.toString() + "hasParticleFilter" + hasParticleFilter;
        //"DieselCar{" + "hasParticleFilter=" + hasParticleFilter + "} " + super.toString();
    }


    @Override
    public String getFuelType() {
        return "FuelType Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int sum = 0;

        if (kmPrLitre() < 5) {
            sum += 10470 + 15260;

        } else if (kmPrLitre() < 10) {

            sum += 5500 + 2770;
        } else if (kmPrLitre() < 15) {

            sum += 2340 + 1850;
        } else if (kmPrLitre() < 20) {

            sum += 1050 + 1390;
        } else {
            sum += 330 + 130;
        }
        if (!hasParticleFilter) {
            sum += 1000;
        }
        return sum;



        /*int DefaultRegistrationFee = getDefaultRegistrationFee();

        int total = 0;

        if (this.kmPrLitre() <= 50 && this.kmPrLitre() >= 20) {
            total = 130 + DefaultRegistrationFee;
        }
        if (this.kmPrLitre() <= 20 && this.kmPrLitre() >= 15) {
            total = 1390 + DefaultRegistrationFee;
        }
        if (this.kmPrLitre() <= 15 && this.kmPrLitre() >= 10) {
            total = 1850 + DefaultRegistrationFee;
        }
        if (this.kmPrLitre() <= 5) {
            total = 2770 + DefaultRegistrationFee;
        }

        if (hasParticleFilter == false){
            total += 1000;

        }
        return total;*/


        // public boolean hasParticleFilter() {
        // if (hasParticleFilter == false) {
        // }
        // return hasParticleFilter;
        //}

        // @Override
        //public String toString () {
        //  return "\n" + getFuelType() + " " + super.toString() + " hasParticleFilter " + hasParticleFilter;

    }
}

