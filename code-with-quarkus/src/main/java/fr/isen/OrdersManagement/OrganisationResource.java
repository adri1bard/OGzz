package fr.isen.OrdersManagement;

import fr.isen.OrdersManagement.Interfaces.Model.Organisation;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/organisation")
public class OrganisationResource {

    Organisation a = new Organisation();
    Organisation b = new Organisation();
    Organisation[] test = {a , b};

    @GET
    public Organisation[] list() {
        return test;
    }
}
