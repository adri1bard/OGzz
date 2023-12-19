package fr.isen.ordersmanagement.Interfaces;

import fr.isen.ordersmanagement.Interfaces.Model.Folder;
import fr.isen.ordersmanagement.Interfaces.Model.Organisation;
import fr.isen.ordersmanagement.Interfaces.Model.Project;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class OrganisationRessource {
    Project a = new Project();
    Project b = new Project();
    Project c = new Project();

    Folder a1 = new Folder();
    a1.setProjects({a, b});
    Folder a2 = new Folder();
    a2.
    Organisation o = new Organisation();


    Organisation[] test = {}
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "Hello from RESTEasy Reactive";
    }
}
