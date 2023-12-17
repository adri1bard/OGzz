package fr.isen.OrdersManagement;

import fr.isen.OrdersManagement.Interfaces.Model.Contact;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/contact")
public class ContactResource {

    Contact a = new Contact();
    Contact b = new Contact();
    Contact[] test = {a , b};

    @GET
    public Contact[] list() {
        return test;
    }
}
