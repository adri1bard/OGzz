package fr.isen.OrdersManagement;

import fr.isen.OrdersManagement.Interfaces.Model.Organisation;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import javax.swing.*;
import java.util.List;

@Path("/test")
public class TestResource {

    Organisation a = new Organisation();
    Organisation b = new Organisation();
    Organisation[] test = {a , b};

    @GET
    public Organisation[] list() {
        return test;
    }
}
