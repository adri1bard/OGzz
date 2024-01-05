package fr.isen.ordersmanagement.interfaces.model;

import fr.isen.ordersmanagement.interfaces.model.enums.ServiceLevel;

//begin of modifiable zone(Javadoc).......C/fa7c810f-ee8e-4189-9e87-e4a34de061d9

//end of modifiable zone(Javadoc).........E/fa7c810f-ee8e-4189-9e87-e4a34de061d9
public class Service {
    public boolean Service1;
    public boolean Service2;
    public boolean Service3;
    public boolean Service4;
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
    private ServiceLevel level;

    public ServiceLevel getLevel() {
        // Automatically generated method. Please do not modify this code.
        return this.level;
    }

    public void setLevel(final ServiceLevel value) {
        // Automatically generated method. Please do not modify this code.
        this.level = value;
        switch (value){
            case Essential:
                this.Service1 = true;
                this.Service2 = true;
                this.Service3 = false;
                this.Service4 = false;
                break;

            case Advanced:
                this.Service1 = true;
                this.Service2 = true;
                this.Service3 = true;
                this.Service4 = false;
                break;

            case Premium:
                this.Service1 = true;
                this.Service2 = true;
                this.Service3 = true;
                this.Service4 = true;
                break;
        }
    }

    private int idService;

    public int getIdService() {
        // Automatically generated method. Please do not modify this code.
        return this.idService;
    }

    public void setIdService(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idService = value;
    }

    public void setService(final ServiceLevel Parameter) {

    }

}
