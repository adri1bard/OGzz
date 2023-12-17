package fr.isen.OrdersManagement.Interfaces.Services;

import java.util.List;
import fr.isen.OrdersManagement.Interfaces.Model.Project;

//begin of modifiable zone(Javadoc).......C/3496ed4e-517d-4f50-b9bb-5b555713a9c2

//end of modifiable zone(Javadoc).........E/3496ed4e-517d-4f50-b9bb-5b555713a9c2
public interface IProjectService {
//begin of modifiable zone(Javadoc).......C/bf221092-912a-4a07-8e11-465b24fe02c3

//end of modifiable zone(Javadoc).........E/bf221092-912a-4a07-8e11-465b24fe02c3
    List<Project> findProjects();

//begin of modifiable zone(Javadoc).......C/3673350e-e02b-4c48-ba47-53a8115aa832

//end of modifiable zone(Javadoc).........E/3673350e-e02b-4c48-ba47-53a8115aa832
    int addProject(final Project Project);

//begin of modifiable zone(Javadoc).......C/81cacb52-8be9-4ce6-bef3-38fc75b44bc6

//end of modifiable zone(Javadoc).........E/81cacb52-8be9-4ce6-bef3-38fc75b44bc6
    List<Project> removeProject(final Project Project);

//begin of modifiable zone(Javadoc).......C/9dcf1f3b-5ab8-4750-a999-84ebc651b2e5

//end of modifiable zone(Javadoc).........E/9dcf1f3b-5ab8-4750-a999-84ebc651b2e5
    Project updateProject(final int Id, final Project Project);

//begin of modifiable zone(Javadoc).......C/cc116be2-7e8f-456a-9435-874e3c6cfceb

//end of modifiable zone(Javadoc).........E/cc116be2-7e8f-456a-9435-874e3c6cfceb
    Project getProject();

}
