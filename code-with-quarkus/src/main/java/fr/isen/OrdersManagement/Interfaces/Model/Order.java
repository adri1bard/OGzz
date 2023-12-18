package fr.isen.OrdersManagement.Interfaces.Model;

import fr.isen.OrdersManagement.Interfaces.Model.enums.License;
import fr.isen.OrdersManagement.Interfaces.Model.enums.Location;
import fr.isen.OrdersManagement.Interfaces.Model.enums.ServiceLevel;

import java.util.Date;

//begin of modifiable zone(Javadoc).......C/e8e93e79-82e1-4cc2-b7e5-473f15e68366

//end of modifiable zone(Javadoc).........E/e8e93e79-82e1-4cc2-b7e5-473f15e68366
public class Order {
//begin of modifiable zone(Javadoc).......C/cddc8bd3-e8d9-43b6-acaf-c291260cdf0d

//end of modifiable zone(Javadoc).........E/cddc8bd3-e8d9-43b6-acaf-c291260cdf0d
    private int idorder;

    public int getIdorder() {
        // Automatically generated method. Please do not modify this code.
        return this.idorder;
    }

    public void setIdorder(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idorder = value;
    }

//begin of modifiable zone(Javadoc).......C/6cd9d515-61e7-4cf8-9a34-0b0e5eccc3b5

//end of modifiable zone(Javadoc).........E/6cd9d515-61e7-4cf8-9a34-0b0e5eccc3b5
    private String name;

    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    public void setName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.name = value;
    }

//begin of modifiable zone(Javadoc).......C/437fb0b5-db68-45bf-ae05-02d39a0c55af

//end of modifiable zone(Javadoc).........E/437fb0b5-db68-45bf-ae05-02d39a0c55af
    private Date date;

    public Date getDate() {
        // Automatically generated method. Please do not modify this code.
        return this.date;
    }

    public void setDate(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.date = value;
    }

//begin of modifiable zone(Javadoc).......C/ee3aeb97-a176-46a4-891d-6ea005c4d427

//end of modifiable zone(Javadoc).........E/ee3aeb97-a176-46a4-891d-6ea005c4d427
    private int idproject;

    public int getIdproject() {
        // Automatically generated method. Please do not modify this code.
        return this.idproject;
    }

    public void setIdproject(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idproject = value;
    }

//begin of modifiable zone(Javadoc).......C/86eafbfc-3e3e-47df-aa7f-34fa2de51b56

//end of modifiable zone(Javadoc).........E/86eafbfc-3e3e-47df-aa7f-34fa2de51b56
    private String solutionName;

    public String getSolutionName() {
        // Automatically generated method. Please do not modify this code.
        return this.solutionName;
    }

    public void setSolutionName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.solutionName = value;
    }

//begin of modifiable zone(Javadoc).......C/1210af9a-f1e4-4209-afaa-df3d23f709ce

//end of modifiable zone(Javadoc).........E/1210af9a-f1e4-4209-afaa-df3d23f709ce
    private String description;

    public String getDescription() {
        // Automatically generated method. Please do not modify this code.
        return this.description;
    }

    public void setDescription(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.description = value;
    }

//begin of modifiable zone(Javadoc).......C/688fb6ab-34e6-4050-8b1e-5ab15bb0d599

//end of modifiable zone(Javadoc).........E/688fb6ab-34e6-4050-8b1e-5ab15bb0d599
    private Location location;

    public Location getLocation() {
        // Automatically generated method. Please do not modify this code.
        return this.location;
    }

    public void setLocation(final Location value) {
        // Automatically generated method. Please do not modify this code.
        this.location = value;
    }

//begin of modifiable zone(Javadoc).......C/f39c2e21-9a44-43a8-8410-517dd9706652

//end of modifiable zone(Javadoc).........E/f39c2e21-9a44-43a8-8410-517dd9706652
    private License license;

    public License getLicense() {
        // Automatically generated method. Please do not modify this code.
        return this.license;
    }

    public void setLicense(final License value) {
        // Automatically generated method. Please do not modify this code.
        this.license = value;
    }

//begin of modifiable zone(Javadoc).......C/a20979ea-3a54-44f5-a6cb-c1c7f240ab76

//end of modifiable zone(Javadoc).........E/a20979ea-3a54-44f5-a6cb-c1c7f240ab76
    private ServiceLevel serviceLevel;

    public ServiceLevel getServiceLevel() {
        // Automatically generated method. Please do not modify this code.
        return this.serviceLevel;
    }

    public void setServiceLevel(final ServiceLevel value) {
        // Automatically generated method. Please do not modify this code.
        this.serviceLevel = value;
    }

//begin of modifiable zone(Javadoc).......C/e5328acf-f5f3-4963-a6c7-0e88f3d89e31

//end of modifiable zone(Javadoc).........E/e5328acf-f5f3-4963-a6c7-0e88f3d89e31
    private Contact contact;

    public Contact getContact() {
        // Automatically generated method. Please do not modify this code.
        return this.contact;
    }

    public void setContact(final Contact value) {
        // Automatically generated method. Please do not modify this code.
        this.contact = value;
    }

//begin of modifiable zone(Javadoc).......C/41d0efe5-6ab0-4e3d-93fe-9d5a9b7556bd

//end of modifiable zone(Javadoc).........E/41d0efe5-6ab0-4e3d-93fe-9d5a9b7556bd
    private double price;

    public double getPrice() {
        // Automatically generated method. Please do not modify this code.
        return this.price;
    }

    public void setPrice(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.price = value;
    }

//begin of modifiable zone(Javadoc).......C/42f66a60-f521-48ce-97fa-d0a73c013d42

//end of modifiable zone(Javadoc).........E/42f66a60-f521-48ce-97fa-d0a73c013d42
    private int carboneFootPrint;

    public int getCarboneFootPrint() {
        // Automatically generated method. Please do not modify this code.
        return this.carboneFootPrint;
    }

    public void setCarboneFootPrint(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.carboneFootPrint = value;
    }

}
