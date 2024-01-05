package fr.isen.ordersmanagement;

import fr.isen.ordersmanagement.interfaces.model.Contact;
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

    @POST
    @Path("/{idOrder}/contact")
    public int createContact(Contact contact) {return orderService.createContact(contact);}

    @PUT
    @Path("/{idOrder}/contact/{idContact}")
    public Contact updateContact(Contact contact, int idContact) {return orderService.updateContact(contact, idContact);}
}
