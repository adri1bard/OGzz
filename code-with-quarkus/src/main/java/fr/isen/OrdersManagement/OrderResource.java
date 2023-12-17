package fr.isen.OrdersManagement;

import fr.isen.OrdersManagement.Interfaces.Model.Order;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/order")
public class OrderResource {

    Order a = new Order();
    Order b = new Order();
    Order[] test = {a , b};

    @GET
    public Order[] list() {
        return test;
    }
}
