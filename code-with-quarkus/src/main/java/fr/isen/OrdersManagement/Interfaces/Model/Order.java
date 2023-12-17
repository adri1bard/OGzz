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
    private int Id;

    public int getId() {
        // Automatically generated method. Please do not modify this code.
        return this.Id;
    }

    public void setId(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.Id = value;
    }

//begin of modifiable zone(Javadoc).......C/6cd9d515-61e7-4cf8-9a34-0b0e5eccc3b5

//end of modifiable zone(Javadoc).........E/6cd9d515-61e7-4cf8-9a34-0b0e5eccc3b5
    private String Name;

    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.Name;
    }

    public void setName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Name = value;
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
    private int IdProject;

    public int getIdProject() {
        // Automatically generated method. Please do not modify this code.
        return this.IdProject;
    }

    public void setIdProject(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.IdProject = value;
    }

//begin of modifiable zone(Javadoc).......C/86eafbfc-3e3e-47df-aa7f-34fa2de51b56

//end of modifiable zone(Javadoc).........E/86eafbfc-3e3e-47df-aa7f-34fa2de51b56
    private String SolutionName;

    public String getSolutionName() {
        // Automatically generated method. Please do not modify this code.
        return this.SolutionName;
    }

    public void setSolutionName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.SolutionName = value;
    }

//begin of modifiable zone(Javadoc).......C/1210af9a-f1e4-4209-afaa-df3d23f709ce

//end of modifiable zone(Javadoc).........E/1210af9a-f1e4-4209-afaa-df3d23f709ce
    private String Description;

    public String getDescription() {
        // Automatically generated method. Please do not modify this code.
        return this.Description;
    }

    public void setDescription(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Description = value;
    }

//begin of modifiable zone(Javadoc).......C/688fb6ab-34e6-4050-8b1e-5ab15bb0d599

//end of modifiable zone(Javadoc).........E/688fb6ab-34e6-4050-8b1e-5ab15bb0d599
    private Location Location;

    public Location getLocation() {
        // Automatically generated method. Please do not modify this code.
        return this.Location;
    }

    public void setLocation(final Location value) {
        // Automatically generated method. Please do not modify this code.
        this.Location = value;
    }

//begin of modifiable zone(Javadoc).......C/f39c2e21-9a44-43a8-8410-517dd9706652

//end of modifiable zone(Javadoc).........E/f39c2e21-9a44-43a8-8410-517dd9706652
    private License License;

    public License getLicense() {
        // Automatically generated method. Please do not modify this code.
        return this.License;
    }

    public void setLicense(final License value) {
        // Automatically generated method. Please do not modify this code.
        this.License = value;
    }

//begin of modifiable zone(Javadoc).......C/a20979ea-3a54-44f5-a6cb-c1c7f240ab76

//end of modifiable zone(Javadoc).........E/a20979ea-3a54-44f5-a6cb-c1c7f240ab76
    private ServiceLevel ServiceLevel;

    public ServiceLevel getServiceLevel() {
        // Automatically generated method. Please do not modify this code.
        return this.ServiceLevel;
    }

    public void setServiceLevel(final ServiceLevel value) {
        // Automatically generated method. Please do not modify this code.
        this.ServiceLevel = value;
    }

//begin of modifiable zone(Javadoc).......C/e5328acf-f5f3-4963-a6c7-0e88f3d89e31

//end of modifiable zone(Javadoc).........E/e5328acf-f5f3-4963-a6c7-0e88f3d89e31
    private Contact Contact;

    public Contact getContact() {
        // Automatically generated method. Please do not modify this code.
        return this.Contact;
    }

    public void setContact(final Contact value) {
        // Automatically generated method. Please do not modify this code.
        this.Contact = value;
    }

}
