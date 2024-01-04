package fr.isen.ordersmanagement.services.impl;

import fr.isen.ordersmanagement.factories.OrderFactory;
import fr.isen.ordersmanagement.factories.OrganisationFactory;
import fr.isen.ordersmanagement.interfaces.model.*;
import fr.isen.ordersmanagement.interfaces.services.IOrderService;
import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.inject.spi.CDI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class OrderServiceImpl implements IOrderService {

    AgroalDataSource dataSource = CDI.current().select(AgroalDataSource.class).get();

    @Override
    public int createOrder(Order order) {
        return 0;
    }

    //La fonction ci-dessous est en cours de réalisation
    /*@Override
    public Order getOrder(int orderId) {
        Order order = null;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `order` WHERE idOrder = " + orderId);
            while(rs.next()){
                order = OrderFactory.getInstance().createOrder();
                order.setIdOrder(rs.getInt(1));
                order.setName(rs.getString(2));
                order.setDateCreation(rs.getDate(3));
                order.setSolutionName(rs.getString(5));
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }*/

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
