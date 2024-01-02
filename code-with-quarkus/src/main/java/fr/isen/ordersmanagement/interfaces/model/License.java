package fr.isen.ordersmanagement.interfaces.model;

import fr.isen.ordersmanagement.interfaces.model.enums.LicenseLevel;

//begin of modifiable zone(Javadoc).......C/61acf67b-0c73-4f91-a348-962a81a6f032

//end of modifiable zone(Javadoc).........E/61acf67b-0c73-4f91-a348-962a81a6f032
public class License {
//begin of modifiable zone(Javadoc).......C/5f49c0c0-9a30-4532-b3f5-f181575ed28f

//end of modifiable zone(Javadoc).........E/5f49c0c0-9a30-4532-b3f5-f181575ed28f
    private double bill;

    public double getBill() {
        // Automatically generated method. Please do not modify this code.
        return this.bill;
    }

    public void setBill(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.bill = value;
    }

//begin of modifiable zone(Javadoc).......C/b7fac016-760b-4f20-b26a-524af91219f8

//end of modifiable zone(Javadoc).........E/b7fac016-760b-4f20-b26a-524af91219f8
    private double carbonFootPrint;

    public double getCarbonFootPrint() {
        // Automatically generated method. Please do not modify this code.
        return this.carbonFootPrint;
    }

    public void setCarbonFootPrint(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.carbonFootPrint = value;
    }

//begin of modifiable zone(Javadoc).......C/db65bde5-75c4-4e26-acef-f0573fd80e58

//end of modifiable zone(Javadoc).........E/db65bde5-75c4-4e26-acef-f0573fd80e58
    private int idLicense;

    public int getIdLicense() {
        // Automatically generated method. Please do not modify this code.
        return this.idLicense;
    }

    public void setIdLicense(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idLicense = value;
    }

//begin of modifiable zone(Javadoc).......C/47eed5f0-8ad7-49e0-b62f-1301e1bb59b2

//end of modifiable zone(Javadoc).........E/47eed5f0-8ad7-49e0-b62f-1301e1bb59b2
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
