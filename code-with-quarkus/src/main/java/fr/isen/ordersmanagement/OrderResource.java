package fr.isen.ordersmanagement;

import fr.isen.ordersmanagement.interfaces.model.*;
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
    public Order readOrder(int idOrder){
        return orderService.getOrder(idOrder);
    }

    @POST
    @Path("/{idProject}")
    public int newOrder(int idProject){return orderService.createOrder(idProject);}

    @PUT
    @Path("/{idOrder}")
    public Order updateOrderInfo(Order order, int idOrder){
        return orderService.updateOrder( order, idOrder);
    }


    //CONTACT
    @POST
    @Path("/{idOrder}/contact")
    public int createContact(Contact contact) {return orderService.createContact(contact);}

    @PUT
    @Path("/{idOrder}/contact/{idContact}")
    public Contact updateOrderAdressContact(Contact contact, int idContact) {
        return orderService.updateContact(contact, idContact);}


    //AVAILABILTY
    @POST
    @Path("/{idOrder}/contact/{idContact}/availability")
    public int createAvailability(Availability availability, int idContact) {return orderService.createAvailability(availability, idContact);}

    @PUT
    @Path("/{idOrder}/contact/{idContact}/availability/{idAvailability}")
    public Availability updateAvailability(Availability availability, int idAvailability){ return  orderService.updateAvailability(availability, idAvailability);}

    //LOCATION
    @POST
    @Path("/{idOrder}/contact/{idContact}/location/{idLocation}")
    public Location updateOrderLocation(Location location, int idLocation) {return orderService.updateLocation(location, idLocation);}

    //LICENSE
    @PUT
    @Path("/{idOrder}/license/{idLicense}")
    public License updateOrderLicense(License license, int idLicense){return orderService.updateLicense(license, idLicense);}

    //SERVICELEVEL
    @PUT
    @Path("/{idOrder}/service/{idService}")
    public Service updateOrderServiceLevel(Service service, int idService){return  orderService.updateServiceLevel(service, idService);}

}
