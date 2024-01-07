package fr.isen.ordersmanagement.interfaces.model;

import fr.isen.ordersmanagement.interfaces.model.enums.Area;

//begin of modifiable zone(Javadoc).......C/0ff63368-26ab-474e-a370-3d8d9fbb5483

//end of modifiable zone(Javadoc).........E/0ff63368-26ab-474e-a370-3d8d9fbb5483
public class Location {

    //location par defaut sera usa
    public Location(){
        this.idLocation = 250;
        this.bill = 100;
        this.carbonFootPrint = 0.151;
        this.area = Area.NorthAmerica;
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

    private Area area;

    public Area getArea() {
        // Automatically generated method. Please do not modify this code.
        return this.area;
    }

    public void setArea(final Area value) {
        // Automatically generated method. Please do not modify this code.
        this.area = value;
    }


    private int idLocation;

    public int getIdLocation() {
        // Automatically generated method. Please do not modify this code.
        return this.idLocation;
    }

    public void setIdLocation(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idLocation = value;
    }

}
