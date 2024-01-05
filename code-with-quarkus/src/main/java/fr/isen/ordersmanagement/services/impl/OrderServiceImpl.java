package fr.isen.ordersmanagement.services.impl;

import fr.isen.ordersmanagement.factories.OrderFactory;
import fr.isen.ordersmanagement.interfaces.model.*;
import fr.isen.ordersmanagement.interfaces.model.enums.Area;
import fr.isen.ordersmanagement.interfaces.model.enums.LicenseLevel;
import fr.isen.ordersmanagement.interfaces.model.enums.ServiceLevel;
import fr.isen.ordersmanagement.interfaces.services.IOrderService;
import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.inject.spi.CDI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements IOrderService {

    AgroalDataSource dataSource = CDI.current().select(AgroalDataSource.class).get();

    @Override
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
                order.setDescription(rs.getString(6));

                int idServiceLevel = rs.getInt(7);
                List<Service> services = getLevels();
                for(Service s: services) {
                    if(s.getIdService() == idServiceLevel) {
                        order.setServiceLevel(s);
                    }
                }


                order.setPrice(rs.getDouble(8));
                order.setCarbonFootPrint(rs.getDouble(9));

                int idLicense = rs.getInt(10);
                List<License> licenses = getLicenses();
                for(License l: licenses) {
                    if(l.getIdLicense() == idLicense) {
                        order.setLicense(l);
                    }
                }

                int idLocation = rs.getInt(11);
                List<Location> locations = getLocations();
                for(Location l: locations) {
                    if(l.getIdLocation() == idLocation) {
                        order.setLocation(l);
                    }
                }

                //POSSIBLE ONE-LINERS
                int idContact = rs.getInt(12);
                Contact contact = getContact(idContact);
                order.setContact(contact);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }

    @Override
    public int createOrder(Order order) {
        return 0;
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
    public Service updateServiceLevel(Service serviceLevel, int id) {
        return null;
    }

    @Override
    public int createServiceLevel(Service serviceLevel) {
        return 0;
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
        Contact contact = null;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM contact WHERE idContact = " + contactId);
            while(rs.next()){
                contact = OrderFactory.getInstance().createContact();
                contact.setIdContact(rs.getInt(1));
                contact.setFirstName(rs.getString(2));
                contact.setLastName(rs.getString(3));
                contact.setCountry(rs.getString(4));
                contact.setCity(rs.getString(5));
                contact.setStreetName(rs.getString(6));
                contact.setPostalCode(rs.getString(7));
                contact.setEmail(rs.getString(8));
                contact.setPhoneNumber(rs.getString(9));

            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contact;
    }

    @Override
    public int createContact(Contact contact) {
        int id = -1;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            String insertQuery = "INSERT INTO contact (firstName, lastName, country, city, streetName, postalCode, email, phoneNumber) " +
                    "VALUES (" + "'" + contact.getFirstName() + "', '" + contact.getLastName() + "', '" + contact.getCountry() + "', '" +
                    contact.getCity() + "', '" + contact.getStreetName() + "', '" + contact.getPostalCode() + "', '" +
                    contact.getEmail() + "', '" + contact.getPhoneNumber() + "')";

            stmt.executeUpdate(insertQuery);

            ResultSet rs = stmt.executeQuery("SELECT * FROM contact WHERE firstName = '" + contact.getFirstName() + "'" + "AND lastName = '" + contact.getLastName() + "'");
            while (rs.next()) {
                id = rs.getInt(1);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    @Override
    public Contact updateContact(Contact contact, int contactId) {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            String updateQuery = "UPDATE contact SET firstName='" + contact.getFirstName() + "', lastName='" + contact.getLastName() + "', country='" + contact.getCountry() + "', city='" + contact.getCity() + "', streetName='" + contact.getStreetName() + "', postalCode='" + contact.getPostalCode() + "', email='" + contact.getEmail() + "', phoneNumber='" + contact.getPhoneNumber() + "' WHERE idContact=" + contactId;
            stmt.executeUpdate(updateQuery);

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return getContact(contactId);
    }

    @Override
    public List<Location> getLocations() {
        List<Location> locations = new ArrayList<>();
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM location");
            while(rs.next()){
                Location location = OrderFactory.getInstance().createLocation();
                location.setIdLocation(rs.getInt(1));
                location.setBill(rs.getDouble(2));
                location.setCarbonFootPrint(rs.getDouble(3));
                int areaValue = rs.getInt(4);
                Area area = Area.convert(areaValue);
                location.setArea(area);
                locations.add(location);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return locations;
    }

    @Override
    public List<License> getLicenses() {
        List<License> licenses = new ArrayList<>();
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM license");
            while(rs.next()){
                License license = OrderFactory.getInstance().createLicense();
                license.setIdLicense(rs.getInt(1));
                license.setBill(rs.getDouble(2));
                license.setCarbonFootPrint(rs.getDouble(3));
                int licenseValue = rs.getInt(4);
                LicenseLevel licenseLevel = LicenseLevel.convert(licenseValue);
                license.setLicense(licenseLevel);
                licenses.add(license);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return licenses;
    }

    @Override
    public List<Availability> getAvailabilities() {
        List<Availability> availabilities = new ArrayList<>();
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM availability");
            while(rs.next()){
                Availability availability = OrderFactory.getInstance().createAvailability();
                availability.setIdAvailability(rs.getInt(1));
                availability.setMorning(rs.getBoolean(2));
                availability.setAfternoon(rs.getBoolean(3));
                /* *
                availability.setDay(rs.getInt(4));

                //A voir plus tard pour celui-ci
                availability.setIdContact(rs.getInt(5));
                * */
                availabilities.add(availability);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return availabilities;
    }

    @Override
    public List<Service> getLevels() {
        List<Service> levels = new ArrayList<>();
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM services");
            while(rs.next()){
                Service service = OrderFactory.getInstance().createService();
                service.setIdService(rs.getInt(1));
                /* *
                A compléter avec Service 1 à 4
                 service.setService();
                 * */

                service.setBill(rs.getDouble(6));
                service.setCarbonFootPrint(rs.getDouble(7));

                int level = rs.getInt(8);
                ServiceLevel serviceLevel = ServiceLevel.convert(level);
                service.setLevel(serviceLevel);

                levels.add(service);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return levels;
    }
}
