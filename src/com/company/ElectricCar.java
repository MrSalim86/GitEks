package com.company;

public class ElectricCar extends ACar{

    private int  batteryCapacity;
    private int  maxRange;

    public ElectricCar(String RegistrationNumber, String Make, String Model, int NumberOfDoors, int batteryCapacity, int maxRange) {
        super(RegistrationNumber, Make, Model, NumberOfDoors);
        this.batteryCapacity = batteryCapacity; // hvor meget den kan have i watt.
        this.maxRange = maxRange; // det er km længe for hvornår den skal lade op igen.
    }

    public int getBatteryCapacityKWh() {
        int wattPrKm = batteryCapacity / maxRange;
        int result = (int) (wattPrKm / 91.25 / 100);
        return result;                                    //returns the battery capacity in kilowatt hours
    }

     public int getMaxRangeKm() {

        return maxRange;                                  // returns the maximum range in kilometres.

    }

    public int getWhPrKm() {
        //int wattPrKm = batteryCapacity / maxRange;


        //return wattPrKm;
        return (batteryCapacity * 1000) / maxRange;   // returns the power consumption in watt hours per driven kilometre.
    }

    @Override
    public int getRegistrationFee() {
        //return 0;
        int kmPrL = (int) ((100.0 / (getWhPrKm() / 91.25))+0.0);

        if(kmPrL < 5)
        {
            return 10470;
        }
        if(kmPrL < 10)
        {
            return 5500;
        }
        if(kmPrL < 15)
        {
            return 2340;
        }
        if(kmPrL < 20)
        {
            return  1050;
        }
        return 330;

   // @Override
   // public String toString() {
       // return "\nElectricCar {" + "batteryCapacity=" + batteryCapacity + " maxRange:=" + maxRange + "} " + super.toString();
    }

    @Override
    public String toString() {
        return super.toString() + "Electric Car" + "battery Capacity =" + batteryCapacity + "max Range=" + maxRange;
        //"ElectricCar{" + "batteryCapacity=" + batteryCapacity + ", maxRange=" + maxRange + "} " + super.toString();
    }
}
