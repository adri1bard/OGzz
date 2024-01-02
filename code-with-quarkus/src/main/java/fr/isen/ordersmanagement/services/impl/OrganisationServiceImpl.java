package fr.isen.ordersmanagement.services.impl;

import fr.isen.ordersmanagement.factories.OrganisationFactory;
import fr.isen.ordersmanagement.interfaces.model.Organisation;
import fr.isen.ordersmanagement.interfaces.services.IOrganisationService;
import jakarta.ws.rs.Path;

import java.util.List;

public class OrganisationServiceImpl implements IOrganisationService {

    @Override
    public Organisation getOrganisation(int organisationId) {
        List<Organisation> organisationList = OrganisationFactory.getInstance().getOrganisationMock();
        for(Organisation organisation: organisationList) {
            if (organisation.getIdOrganisation() == organisationId) {
                return organisation;
            }
        }
        return null;
    }
}
