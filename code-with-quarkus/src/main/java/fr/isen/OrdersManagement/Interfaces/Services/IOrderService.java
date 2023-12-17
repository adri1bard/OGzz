package fr.isen.OrdersManagement.Interfaces.Services;

import java.util.List;
import fr.isen.OrdersManagement.Interfaces.Model.Order;
import fr.isen.OrdersManagement.Interfaces.Model.Project;

//begin of modifiable zone(Javadoc).......C/6b567f62-4258-477d-88c7-89188d73c165

//end of modifiable zone(Javadoc).........E/6b567f62-4258-477d-88c7-89188d73c165
public interface IOrderService {
//begin of modifiable zone(Javadoc).......C/7f48ec0d-9571-411e-9c7c-6ee2a6caeb1e

//end of modifiable zone(Javadoc).........E/7f48ec0d-9571-411e-9c7c-6ee2a6caeb1e
    List<Order> findOrders();

//begin of modifiable zone(Javadoc).......C/f96c33a2-5ac7-459c-9d0f-267a6b1ac5ed

//end of modifiable zone(Javadoc).........E/f96c33a2-5ac7-459c-9d0f-267a6b1ac5ed
    int addOrder(final Order Order);

//begin of modifiable zone(Javadoc).......C/01c3099a-4180-4c63-b501-70a0534150e9

//end of modifiable zone(Javadoc).........E/01c3099a-4180-4c63-b501-70a0534150e9
    Order getOrder();

//begin of modifiable zone(Javadoc).......C/07b67ccf-f1fd-45f5-93ba-41982ce40cbe

//end of modifiable zone(Javadoc).........E/07b67ccf-f1fd-45f5-93ba-41982ce40cbe
    Order updateOrder(final int Id, final Order Order);

//begin of modifiable zone(Javadoc).......C/4ff5d8ad-c959-48cc-91d2-226f9b7aaec9

//end of modifiable zone(Javadoc).........E/4ff5d8ad-c959-48cc-91d2-226f9b7aaec9
    List<Project> removeOrder(final Order Order);

}
