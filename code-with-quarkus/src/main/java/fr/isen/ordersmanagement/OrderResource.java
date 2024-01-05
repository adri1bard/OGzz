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

    @PUT
    @Path("/{idOrder}/contact/{idContact}/availability/{idAvailability}")
    public Availability updateAvailability(Availability availability, int idAvailability){ return  orderService.updateAvailability(availability, idAvailability);}

    //LOCATION
    @POST
    @Path("/{idOrder}/contact/{idContact}/location")
    public int createLocation(Location location) {return orderService.createLocation(location);}

    @POST
    @Path("/{idOrder}/contact/{idContact}/location/{idLocation}")
    public Location updateLocation(Location location, int idLocation) {return orderService.updateLocation(location, idLocation);}

    //LICENSE
    @POST
    @Path("/{idOrder}/license")
    public int createLicense(License license){return orderService.createLicense(license);}

    @PUT
    @Path("/{idOrder}/license/{idLicense}")
    public License updateLicense(License license, int idLicense){return orderService.updateLicense(license, idLicense);}

    //SERVICELEVEL
    @POST
    @Path("/{idOrder}/service")
    public int createService(Service service){return orderService.createServiceLevel(service);}

    @PUT
    @Path("/{idOrder}/service/{idService}")
    public Service updateService(Service service, int idService){return  orderService.updateServiceLevel(service, idService);}

}
