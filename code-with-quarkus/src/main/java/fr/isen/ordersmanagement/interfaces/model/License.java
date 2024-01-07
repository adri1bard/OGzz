package fr.isen.ordersmanagement.interfaces.model;

import fr.isen.ordersmanagement.interfaces.model.enums.LicenseLevel;

//begin of modifiable zone(Javadoc).......C/61acf67b-0c73-4f91-a348-962a81a6f032

//end of modifiable zone(Javadoc).........E/61acf67b-0c73-4f91-a348-962a81a6f032
public class License {

    public License(){
        //la license par defaut sera dedicated
        this.idLicense = 1; //id correspondant à dedicated dans la bdd
        this.bill = 150;
        this.carbonFootPrint = 0;
        this.license = LicenseLevel.Dedicated;
    }

    private double bill;
    public double getBill() {
        // Automatically generated method. Please do not modify this code.
        return this.bill;
    }

    public void setBill(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.bill = value;
    }


    private double carbonFootPrint;

    public double getCarbonFootPrint() {
        // Automatically generated method. Please do not modify this code.
        return this.carbonFootPrint;
    }

    public void setCarbonFootPrint(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.carbonFootPrint = value;
    }


    private int idLicense;

    public int getIdLicense() {
        // Automatically generated method. Please do not modify this code.
        return this.idLicense;
    }

    public void setIdLicense(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idLicense = value;
    }

    private LicenseLevel license;

    public LicenseLevel getLicense() {
        // Automatically generated method. Please do not modify this code.
        return this.license;
    }

    public void setLicense(final LicenseLevel value) {
        // Automatically generated method. Please do not modify this code.
        this.license = value;
    }

}
