package fr.isen.OrdersManagement;

import fr.isen.OrdersManagement.Interfaces.Model.Project;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/project")
public class ProjectResource {

    Project a = new Project();
    Project b = new Project();
    Project[] test = {a , b};

    @GET
    public Project[] list() {
        return test;
    }
}
