package fr.isen.OrdersManagement.Interfaces.Model;


//begin of modifiable zone(Javadoc).......C/f3d771e4-a46d-4c58-b8c8-f811be3f722f

import javax.swing.*;

//end of modifiable zone(Javadoc).........E/f3d771e4-a46d-4c58-b8c8-f811be3f722f
public class Organisation {
//begin of modifiable zone(Javadoc).......C/b42fe84b-e832-4b11-8fa0-89ace8670fd2

//end of modifiable zone(Javadoc).........E/b42fe84b-e832-4b11-8fa0-89ace8670fd2
    private JList<Folder>[] Folders;

    public JList<Folder>[] getFolders() {
        // Automatically generated method. Please do not modify this code.
        return this.Folders;
    }

    public void setFolders(final JList<Folder>[] value) {
        // Automatically generated method. Please do not modify this code.
        this.Folders = value;
    }

//begin of modifiable zone(Javadoc).......C/3c29c411-98e6-434f-a82b-470d303e22bf

//end of modifiable zone(Javadoc).........E/3c29c411-98e6-434f-a82b-470d303e22bf
    private int Id;

    public int getId() {
        // Automatically generated method. Please do not modify this code.
        return this.Id;
    }

    public void setId(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.Id = value;
    }

//begin of modifiable zone(Javadoc).......C/520273b6-0059-433d-99dd-2e6165203217

//end of modifiable zone(Javadoc).........E/520273b6-0059-433d-99dd-2e6165203217
    private String Name;

    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.Name;
    }

    public void setName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.Name = value;
    }

//begin of modifiable zone(Javadoc).......C/5db67184-6b0a-495b-bfbc-64a101669bce

//end of modifiable zone(Javadoc).........E/5db67184-6b0a-495b-bfbc-64a101669bce
    private JList<Order>[] Orders;

    public JList<Order>[] getOrders() {
        // Automatically generated method. Please do not modify this code.
        return this.Orders;
    }

    public void setOrders(final JList<Order>[] value) {
        // Automatically generated method. Please do not modify this code.
        this.Orders = value;
    }

}
