package fr.isen.ordersmanagement;

import fr.isen.ordersmanagement.interfaces.model.Availability;
import fr.isen.ordersmanagement.interfaces.model.Contact;
import fr.isen.ordersmanagement.interfaces.model.Location;
import fr.isen.ordersmanagement.interfaces.model.Order;
import fr.isen.ordersmanagement.interfaces.services.IOrderService;
import fr.isen.ordersmanagement.services.impl.OrderServiceImpl;

import jakarta.ws.rs.*;

@Path("/orders")
public class OrderResource {
    private IOrderService orderService;
    public OrderResource() {this.orderService = new OrderServiceImpl();}

    //ORDER
    @GET
    @Path("/{idOrder}")
    public Order getOrder(int idOrder){
        return orderService.getOrder(idOrder);
    }


    //CONTACT
    @POST
    @Path("/{idOrder}/contact")
    public int createContact(Contact contact) {return orderService.createContact(contact);}

    @PUT
    @Path("/{idOrder}/contact/{idContact}")
    public Contact updateContact(Contact contact, int idContact) {return orderService.updateContact(contact, idContact);}


    //AVAILABILTY
    @POST
    @Path("/{idOrder}/contact/{idContact}/availability")
    public int createAvailability(Availability availability, int idContact) {return orderService.createAvailability(availability, idContact);}

    //LOCATION
    @POST
    @Path("/{idOrder}/contact/{idContact}/location")
    public int createLocation(Location location) {return orderService.createLocation(location);}

    @POST
    @Path("/{idOrder}/contact/{idContact}/location/{idLocation}")
    public Location updateLocation(Location location, int idLocation) {return orderService.updateLocation(location, idLocation);}
}
