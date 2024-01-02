package fr.isen.ordersmanagement;

import fr.isen.ordersmanagement.interfaces.model.Order;
import fr.isen.ordersmanagement.interfaces.services.IOrderService;
import fr.isen.ordersmanagement.services.impl.OrderServiceImpl;

import jakarta.ws.rs.*;

@Path("/orders")
public class OrderResource {
    private IOrderService orderService;
    public OrderResource() {this.orderService = new OrderServiceImpl();}

    @GET
    @Path("/{idOrder}")
    public Order getOrder(int idOrder){
        return orderService.getOrder(idOrder);
    }
}
