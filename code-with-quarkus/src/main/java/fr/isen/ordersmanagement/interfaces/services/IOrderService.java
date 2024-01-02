package fr.isen.ordersmanagement.interfaces.services;

import java.util.List;
import fr.isen.ordersmanagement.interfaces.model.Availability;
import fr.isen.ordersmanagement.interfaces.model.Contact;
import fr.isen.ordersmanagement.interfaces.model.License;
import fr.isen.ordersmanagement.interfaces.model.Location;
import fr.isen.ordersmanagement.interfaces.model.Order;
import fr.isen.ordersmanagement.interfaces.model.Service;

//begin of modifiable zone(Javadoc).......C/6c89eabd-f62a-4b39-a1ec-9997b36226a6

//end of modifiable zone(Javadoc).........E/6c89eabd-f62a-4b39-a1ec-9997b36226a6
public interface IOrderService {
//begin of modifiable zone(Javadoc).......C/20c59fdc-6f03-4def-8cb0-9a7ba76127ec

//end of modifiable zone(Javadoc).........E/20c59fdc-6f03-4def-8cb0-9a7ba76127ec
    int createOrder(final Order order);

//begin of modifiable zone(Javadoc).......C/17ea24b7-12f1-487b-bf40-8823b6772863

//end of modifiable zone(Javadoc).........E/17ea24b7-12f1-487b-bf40-8823b6772863
    Order getOrder(final int orderId);

//begin of modifiable zone(Javadoc).......C/defb4fff-5526-4471-9ec0-9a5faa9f0cbd

//end of modifiable zone(Javadoc).........E/defb4fff-5526-4471-9ec0-9a5faa9f0cbd
    Order updateOrder(final Order order, final int orderId);

//begin of modifiable zone(Javadoc).......C/bd929dd7-a19b-4272-b162-697d3284612c

//end of modifiable zone(Javadoc).........E/bd929dd7-a19b-4272-b162-697d3284612c
    int createAvailability(final Availability availability);

//begin of modifiable zone(Javadoc).......C/c9fbe4db-e755-432c-bdab-2600f2701ade

//end of modifiable zone(Javadoc).........E/c9fbe4db-e755-432c-bdab-2600f2701ade
    int createContact(final int orderId, final Contact contact);

//begin of modifiable zone(Javadoc).......C/5573829b-211a-4305-982e-0127bfd18b12

//end of modifiable zone(Javadoc).........E/5573829b-211a-4305-982e-0127bfd18b12
    Service updateServiceLevel(final Service serviceLevel, final int id);

//begin of modifiable zone(Javadoc).......C/e4bef2aa-75df-4713-b178-08a284abc6e1

//end of modifiable zone(Javadoc).........E/e4bef2aa-75df-4713-b178-08a284abc6e1
    int createServiceLevel(final Service serviceLevel);

//begin of modifiable zone(Javadoc).......C/4636366c-0e88-495a-9c83-d116abfb02c7

//end of modifiable zone(Javadoc).........E/4636366c-0e88-495a-9c83-d116abfb02c7
    Contact updateContact(final Contact contact, final int orderId, final int contactId);

//begin of modifiable zone(Javadoc).......C/c457c9d0-a3b4-4210-87fb-63f4624b0d9d

//end of modifiable zone(Javadoc).........E/c457c9d0-a3b4-4210-87fb-63f4624b0d9d
    int createLocation(final Location location);

//begin of modifiable zone(Javadoc).......C/cccaddca-de49-4031-92e0-045db36cd9c1

//end of modifiable zone(Javadoc).........E/cccaddca-de49-4031-92e0-045db36cd9c1
    License updateLicense(final License license, final int licenseId);

//begin of modifiable zone(Javadoc).......C/73211f04-b567-4aa2-b729-26ee0e9e9e25

//end of modifiable zone(Javadoc).........E/73211f04-b567-4aa2-b729-26ee0e9e9e25
    Availability updateAvailability(final Availability availability, final int id);

//begin of modifiable zone(Javadoc).......C/9c67eb00-d93d-409d-8e19-8bd2998f71c7

//end of modifiable zone(Javadoc).........E/9c67eb00-d93d-409d-8e19-8bd2998f71c7
    Location updateLocation(final Location location, final int locationId);

//begin of modifiable zone(Javadoc).......C/9c6e1bb6-0cc5-4d4d-b7a5-a261a8b8f77d

//end of modifiable zone(Javadoc).........E/9c6e1bb6-0cc5-4d4d-b7a5-a261a8b8f77d
    int createLicense(final License license);

//begin of modifiable zone(Javadoc).......C/f92a8718-c93f-43cb-9c5a-4b8bff48bc6f

//end of modifiable zone(Javadoc).........E/f92a8718-c93f-43cb-9c5a-4b8bff48bc6f
    Contact getContact(final int contactId);

//begin of modifiable zone(Javadoc).......C/fd60ba19-1077-4739-a56b-130ee57253cd

//end of modifiable zone(Javadoc).........E/fd60ba19-1077-4739-a56b-130ee57253cd
    List<Location> getLocations();

//begin of modifiable zone(Javadoc).......C/6ec4c07a-b7bb-4899-adc7-4866c6c69068

//end of modifiable zone(Javadoc).........E/6ec4c07a-b7bb-4899-adc7-4866c6c69068
    List<License> getLicenses();

//begin of modifiable zone(Javadoc).......C/41403980-bcba-4d72-854f-0d4230db4565

//end of modifiable zone(Javadoc).........E/41403980-bcba-4d72-854f-0d4230db4565
    List<Availability> getAvailabilities();

//begin of modifiable zone(Javadoc).......C/02731674-5c72-4ad8-a30d-85cbb1863526

//end of modifiable zone(Javadoc).........E/02731674-5c72-4ad8-a30d-85cbb1863526
    List<Service> getLevels();

}
