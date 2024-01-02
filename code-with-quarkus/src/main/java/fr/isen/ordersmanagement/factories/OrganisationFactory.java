package fr.isen.ordersmanagement.factories;

import fr.isen.ordersmanagement.interfaces.model.Organisation;

import java.util.ArrayList;
import java.util.List;

public class OrganisationFactory {
    private static List<Organisation> organisations = null;
    static OrganisationFactory instance = null;
    public static OrganisationFactory getInstance(){
        if(instance == null){
            instance = new OrganisationFactory();
        }
        return instance;
    }

    public Organisation createOrganisation(){
        return new Organisation();
    }

    public List<Organisation> getOrganisationMock(){
        if(organisations == null) {
            organisations = new ArrayList<Organisation>();
            organisations.add(new Organisation());
            organisations.add(new Organisation());
        }
        return organisations;
    }

}
