package fr.isen.ordersmanagement.factories;

import fr.isen.ordersmanagement.OrganisationResource;
import fr.isen.ordersmanagement.interfaces.model.*;
import fr.isen.ordersmanagement.interfaces.model.enums.ServiceLevel;

import java.util.ArrayList;
import java.util.List;

public class OrderFactory {
    private static List<Order> orders = null;
    static OrderFactory instance = null;
    public static OrderFactory getInstance(){
        if(instance == null){
            instance = new OrderFactory();
        }
        return instance;
    }

    public Order createOrder(){
        return new Order();
    }

    public Contact createContact() {return new Contact();}

    public Location createLocation() {return new Location();}

    public License createLicense() {return new License();}

    public Availability createAvailability() {return new Availability();}

    public Service createService() {return new Service();}


    public List<Order> getOrderMock(){
        Order o = new Order();
        o.setIdOrder(1);
        o.setName("Order1");
        if(orders == null) {
            orders = new ArrayList<Order>();
            orders.add(o);
        }
        return orders;
    }
}
