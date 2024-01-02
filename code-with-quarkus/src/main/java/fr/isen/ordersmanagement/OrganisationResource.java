package fr.isen.ordersmanagement;

import fr.isen.ordersmanagement.interfaces.model.Organisation;
import fr.isen.ordersmanagement.interfaces.services.IOrganisationService;
import fr.isen.ordersmanagement.services.impl.OrganisationServiceImpl;
import jakarta.ws.rs.*;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

@Path("/organisations")
public class OrganisationResource {
    //private Set<Organisation> organisations = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    private IOrganisationService organisationService;
    public OrganisationResource() {this.organisationService = new OrganisationServiceImpl();}

    @GET
    public Organisation getOrganisation(int idOrganisation){
        return organisationService.getOrganisation(idOrganisation);
    }
}
