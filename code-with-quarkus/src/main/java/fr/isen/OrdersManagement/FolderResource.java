package fr.isen.OrdersManagement;

import fr.isen.OrdersManagement.Interfaces.Model.Folder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/folder")
public class FolderResource {

    Folder a = new Folder();
    Folder b = new Folder();
    Folder[] test = {a , b};

    @GET
    public Folder[] list() {
        return test;
    }
}
