package fr.isen.ordersmanagement.factories;

import fr.isen.ordersmanagement.OrganisationResource;
import fr.isen.ordersmanagement.interfaces.model.Order;
import fr.isen.ordersmanagement.interfaces.model.Organisation;

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
