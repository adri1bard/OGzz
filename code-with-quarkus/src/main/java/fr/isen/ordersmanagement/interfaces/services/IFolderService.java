package fr.isen.ordersmanagement.interfaces.services;

import java.util.List;
import fr.isen.ordersmanagement.interfaces.model.Folder;

//begin of modifiable zone(Javadoc).......C/46f26afc-9699-4f83-b518-550aff5d19d7

//end of modifiable zone(Javadoc).........E/46f26afc-9699-4f83-b518-550aff5d19d7
public interface IFolderService {
//begin of modifiable zone(Javadoc).......C/60c9624d-5276-452e-aa6d-6e18f9b27c25

//end of modifiable zone(Javadoc).........E/60c9624d-5276-452e-aa6d-6e18f9b27c25
    List<Folder> findFolders();

//begin of modifiable zone(Javadoc).......C/04ce9769-8534-468a-845a-d1c9968a5805

//end of modifiable zone(Javadoc).........E/04ce9769-8534-468a-845a-d1c9968a5805
    Folder getFolder();

//begin of modifiable zone(Javadoc).......C/67863525-f138-4176-898e-bbcdc06f07d3

//end of modifiable zone(Javadoc).........E/67863525-f138-4176-898e-bbcdc06f07d3
    Folder updateFolder(final int Id, final Folder Folder);

//begin of modifiable zone(Javadoc).......C/2da27a4c-de5f-4611-a445-d6e76cb61c13

//end of modifiable zone(Javadoc).........E/2da27a4c-de5f-4611-a445-d6e76cb61c13
    int addFolder(final Folder Folder);

//begin of modifiable zone(Javadoc).......C/74775168-9e23-4aca-bede-65da98b7ee40

//end of modifiable zone(Javadoc).........E/74775168-9e23-4aca-bede-65da98b7ee40
    List<Folder> removeFolder(final Folder Folder);

}
