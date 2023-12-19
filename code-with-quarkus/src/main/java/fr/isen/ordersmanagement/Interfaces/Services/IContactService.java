package fr.isen.ordersmanagement.Interfaces.Services;

import java.util.List;
import fr.isen.ordersmanagement.Interfaces.Model.Contact;

//begin of modifiable zone(Javadoc).......C/76be0629-d85f-41ed-974e-b923d982bd8f

//end of modifiable zone(Javadoc).........E/76be0629-d85f-41ed-974e-b923d982bd8f
public interface IContactService {
//begin of modifiable zone(Javadoc).......C/2ac0a732-13ee-4c9d-a15f-c54ae0bf5885

//end of modifiable zone(Javadoc).........E/2ac0a732-13ee-4c9d-a15f-c54ae0bf5885
    List<Contact> findContacts();

//begin of modifiable zone(Javadoc).......C/7f4dcf25-cf89-487f-9fb1-4e6d4f1c2981

//end of modifiable zone(Javadoc).........E/7f4dcf25-cf89-487f-9fb1-4e6d4f1c2981
    List<Contact> removeContact(final Contact Contact);

//begin of modifiable zone(Javadoc).......C/99769821-81cc-47aa-a247-4efbcbfdcb72

//end of modifiable zone(Javadoc).........E/99769821-81cc-47aa-a247-4efbcbfdcb72
    int addContact(final Contact Contact);

//begin of modifiable zone(Javadoc).......C/ba5357bc-8470-4f60-8b68-9728063d1aa6

//end of modifiable zone(Javadoc).........E/ba5357bc-8470-4f60-8b68-9728063d1aa6
    Contact getContact();

//begin of modifiable zone(Javadoc).......C/bc134f73-51a7-450d-a55e-1b801c9aff77

//end of modifiable zone(Javadoc).........E/bc134f73-51a7-450d-a55e-1b801c9aff77
    Contact updateContact(final int Id, final Contact contact);

}
