package fr.isen.OrdersManagement.Interfaces.Model;


//begin of modifiable zone(Javadoc).......C/10813633-d0fd-41ca-b097-5c50b39e6ab9

import javax.swing.*;

//end of modifiable zone(Javadoc).........E/10813633-d0fd-41ca-b097-5c50b39e6ab9
public class Folder {
//begin of modifiable zone(Javadoc).......C/d1760788-bb54-4cfa-afae-70c11f87a8eb

//end of modifiable zone(Javadoc).........E/d1760788-bb54-4cfa-afae-70c11f87a8eb
    private int Id;

    public int getId() {
        // Automatically generated method. Please do not modify this code.
        return this.Id;
    }

    public void setId(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.Id = value;
    }

//begin of modifiable zone(Javadoc).......C/faf75908-d169-4049-a4ab-d82d7e0460fc

//end of modifiable zone(Javadoc).........E/faf75908-d169-4049-a4ab-d82d7e0460fc
    private String Name;

    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.Name;
    }

    public void setName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Name = value;
    }

//begin of modifiable zone(Javadoc).......C/052a83da-5f45-46af-8926-984855c80cf6

//end of modifiable zone(Javadoc).........E/052a83da-5f45-46af-8926-984855c80cf6
    private JList<Project>[] Projects;

    public JList<Project>[] getProjects() {
        // Automatically generated method. Please do not modify this code.
        return this.Projects;
    }

    public void setProjects(final JList<Project>[] value) {
        // Automatically generated method. Please do not modify this code.
        this.Projects = value;
    }

}
