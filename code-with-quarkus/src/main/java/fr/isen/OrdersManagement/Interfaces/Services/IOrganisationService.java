package fr.isen.OrdersManagement.Interfaces.Services;

import java.util.List;
import fr.isen.OrdersManagement.Interfaces.Model.Organisation;

//begin of modifiable zone(Javadoc).......C/179bb7bf-53ac-4273-9741-c8a09b93e898

//end of modifiable zone(Javadoc).........E/179bb7bf-53ac-4273-9741-c8a09b93e898
public interface IOrganisationService {
//begin of modifiable zone(Javadoc).......C/fa70a2b5-6236-4dd2-98c9-51bd70611fa8

//end of modifiable zone(Javadoc).........E/fa70a2b5-6236-4dd2-98c9-51bd70611fa8
    List<Organisation> findOrganisations();

//begin of modifiable zone(Javadoc).......C/4539d3b1-10f0-4df5-8bf9-0abebc956ef6

//end of modifiable zone(Javadoc).........E/4539d3b1-10f0-4df5-8bf9-0abebc956ef6
    List<Organisation> removeOrganisation(final Organisation Organisation);

//begin of modifiable zone(Javadoc).......C/58d14740-b12c-4e2c-80a2-48d9f13d5913

//end of modifiable zone(Javadoc).........E/58d14740-b12c-4e2c-80a2-48d9f13d5913
    Organisation updateOrganisation(final int Id, final Organisation Organisation);

//begin of modifiable zone(Javadoc).......C/3ca22c70-a903-41c0-bb17-26b7a3052ce6

//end of modifiable zone(Javadoc).........E/3ca22c70-a903-41c0-bb17-26b7a3052ce6
    Organisation getOrganisation();

//begin of modifiable zone(Javadoc).......C/4fb03754-d4d0-493c-8c69-686f440a1060

//end of modifiable zone(Javadoc).........E/4fb03754-d4d0-493c-8c69-686f440a1060
    int addOrganisation(final Organisation organisation);

}
