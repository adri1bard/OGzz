package fr.isen.OrdersManagement.Interfaces.Model;


//begin of modifiable zone................T/35388394-3135-48ac-977b-77bab928d9da
/**
 * import javax.swing.*;
 */
//end of modifiable zone..................E/35388394-3135-48ac-977b-77bab928d9da
public class Organisation {
//begin of modifiable zone(Javadoc).......C/b42fe84b-e832-4b11-8fa0-89ace8670fd2

//end of modifiable zone(Javadoc).........E/b42fe84b-e832-4b11-8fa0-89ace8670fd2
    private Folder[] folders;

    public Folder[] getFolders() {
        // Automatically generated method. Please do not modify this code.
        return this.folders;
    }

    public void setFolders(final Folder[] value) {
        // Automatically generated method. Please do not modify this code.
        this.folders = value;
    }

//begin of modifiable zone(Javadoc).......C/3c29c411-98e6-434f-a82b-470d303e22bf

//end of modifiable zone(Javadoc).........E/3c29c411-98e6-434f-a82b-470d303e22bf
    private int idorganisation;

    public int getIdorganisation() {
        // Automatically generated method. Please do not modify this code.
        return this.idorganisation;
    }

    public void setIdorganisation(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idorganisation = value;
    }

//begin of modifiable zone(Javadoc).......C/520273b6-0059-433d-99dd-2e6165203217

//end of modifiable zone(Javadoc).........E/520273b6-0059-433d-99dd-2e6165203217
    private String name;

    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    public void setName(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.name = value;
    }

//begin of modifiable zone(Javadoc).......C/5db67184-6b0a-495b-bfbc-64a101669bce

//end of modifiable zone(Javadoc).........E/5db67184-6b0a-495b-bfbc-64a101669bce
    private Order[] orders;

    public Order[] getOrders() {
        // Automatically generated method. Please do not modify this code.
        return this.orders;
    }

    public void setOrders(final Order[] value) {
        // Automatically generated method. Please do not modify this code.
        this.orders = value;
    }

}
