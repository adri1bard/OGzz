package fr.isen.ordersmanagement.interfaces.model;


//begin of modifiable zone................T/fbcc3556-82a1-4d9f-8fd7-ee4e8736b3a0

import java.time.LocalDate;
import java.util.Date;

//end of modifiable zone..................E/fbcc3556-82a1-4d9f-8fd7-ee4e8736b3a0
public class Order {

    public Order(){
        this.idOrder = -1;
        this.name = "";
        this.solutionName ="";
        this.description ="";
        LocalDate today = LocalDate.now();
        this.dateCreation = today.toString();

        this.location = new Location();
        this.serviceLevel = new Service();
        this.license = new License();
        this.contact = new Contact();
        this.project = null;

        this.price = this.license.getBill() + this.serviceLevel.getBill() + this.location.getBill();
        this.carbonFootPrint = this.license.getCarbonFootPrint() + this.serviceLevel.getBill() + this.location.getBill();
    }

    private int idOrder;

    public int getIdOrder() {
        // Automatically generated method. Please do not modify this code.
        return this.idOrder;
    }

    public void setIdOrder(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idOrder = value;
    }

    private String name;

    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    public void setName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.name = value;
    }

    private String dateCreation;

    public String getDateCreation() {
        // Automatically generated method. Please do not modify this code.
        return this.dateCreation;
    }

    public void setDateCreation(String value) {
        // Automatically generated method. Please do not modify this code.
        this.dateCreation = value;
    }

    private Project project;

    public Project getProject() {
        // Automatically generated method. Please do not modify this code.
        return this.project;
    }

    public void setProject(final Project value) {
        // Automatically generated method. Please do not modify this code.
        this.project = value;
    }

    private String solutionName;

    public String getSolutionName() {
        // Automatically generated method. Please do not modify this code.
        return this.solutionName;
    }

    public void setSolutionName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.solutionName = value;
    }

    private String description;

    public String getDescription() {
        // Automatically generated method. Please do not modify this code.
        return this.description;
    }

    public void setDescription(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.description = value;
    }


    private Location location;

    public Location getLocation() {
        // Automatically generated method. Please do not modify this code.
        return this.location;
    }

    public void setLocation(final Location value) {
        // Automatically generated method. Please do not modify this code.
        this.location = value;
    }

    private License license;

    public License getLicense() {
        // Automatically generated method. Please do not modify this code.
        return this.license;
    }

    public void setLicense(final License value) {
        // Automatically generated method. Please do not modify this code.
        this.license = value;
    }

    private Service serviceLevel;

    public Service getServiceLevel() {
        // Automatically generated method. Please do not modify this code.
        return this.serviceLevel;
    }

    public void setServiceLevel(final Service value) {
        // Automatically generated method. Please do not modify this code.
        this.serviceLevel = value;
    }

    private Contact contact;

    public Contact getContact() {
        // Automatically generated method. Please do not modify this code.
        return this.contact;
    }

    public void setContact(final Contact value) {
        // Automatically generated method. Please do not modify this code.
        this.contact = value;
    }

    private double price;

    public double getPrice() {
        // Automatically generated method. Please do not modify this code.
        return this.price;
    }

    public void setPrice(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.price = value;
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

}
