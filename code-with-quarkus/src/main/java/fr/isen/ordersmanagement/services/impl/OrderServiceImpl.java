package fr.isen.ordersmanagement.services.impl;

import fr.isen.ordersmanagement.factories.OrderFactory;
import fr.isen.ordersmanagement.factories.OrganisationFactory;
import fr.isen.ordersmanagement.interfaces.model.*;
import fr.isen.ordersmanagement.interfaces.services.IOrderService;

import java.util.List;

public class OrderServiceImpl implements IOrderService {
    @Override
    public int createOrder(Order order) {
        return 0;
    }

    @Override
    public Order getOrder(int orderId) {
        List<Order> orderList = OrderFactory.getInstance().getOrderMock();
        for(Order order: orderList) {
            if (order.getIdOrder() == orderId) {
                return order;
            }
        }
        return null;
    }

    @Override
    public Order updateOrder(Order order, int orderId) {
        return null;
    }

    @Override
    public int createAvailability(Availability availability) {
        return 0;
    }

    @Override
    public int createContact(int orderId, Contact contact) {
        return 0;
    }

    @Override
    public Service updateServiceLevel(Service serviceLevel, int id) {
        return null;
    }

    @Override
    public int createServiceLevel(Service serviceLevel) {
        return 0;
    }

    @Override
    public Contact updateContact(Contact contact, int orderId, int contactId) {
        return null;
    }

    @Override
    public int createLocation(Location location) {
        return 0;
    }

    @Override
    public License updateLicense(License license, int licenseId) {
        return null;
    }

    @Override
    public Availability updateAvailability(Availability availability, int id) {
        return null;
    }

    @Override
    public Location updateLocation(Location location, int locationId) {
        return null;
    }

    @Override
    public int createLicense(License license) {
        return 0;
    }

    @Override
    public Contact getContact(int contactId) {
        return null;
    }

    @Override
    public List<Location> getLocations() {
        return null;
    }

    @Override
    public List<License> getLicenses() {
        return null;
    }

    @Override
    public List<Availability> getAvailabilities() {
        return null;
    }

    @Override
    public List<Service> getLevels() {
        return null;
    }
}
