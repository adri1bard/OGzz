package fr.isen.ordersmanagement;

import fr.isen.ordersmanagement.interfaces.model.Organisation;
import fr.isen.ordersmanagement.interfaces.services.IOrganisationService;
import fr.isen.ordersmanagement.services.impl.OrganisationServiceImpl;
import jakarta.ws.rs.*;

@Path("/organisations")
public class OrganisationResource {
    private IOrganisationService organisationService;
    public OrganisationResource() {this.organisationService = new OrganisationServiceImpl();}

    @GET
    @Path("/{idOrganisation}")
    public Organisation getOrganisation(int idOrganisation){
        return organisationService.getOrganisation(idOrganisation);
    }
}
