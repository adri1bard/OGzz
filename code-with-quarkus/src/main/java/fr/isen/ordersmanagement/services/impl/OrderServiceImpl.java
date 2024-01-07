package fr.isen.ordersmanagement.services.impl;

import fr.isen.ordersmanagement.factories.OrderFactory;
import fr.isen.ordersmanagement.interfaces.model.License;
import fr.isen.ordersmanagement.interfaces.model.*;
import fr.isen.ordersmanagement.interfaces.model.enums.*;
import fr.isen.ordersmanagement.interfaces.services.IOrderService;
import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.inject.spi.CDI;

import javax.swing.*;
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
                order.setDateCreation(rs.getString(3));

                int idProject = rs.getInt(4);
                Project project = getProject(idProject);
                order.setProject(project);

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

                order.setCurrentState( State.convertIntToEnum(rs.getInt(13) ));
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
    }

    @Override
    public int createOrder(int idProject) {

        int id = -1;
        Connection conn = null;

        Order newOrder = OrderFactory.getInstance().createOrder();
        newOrder.setProject( getProject(idProject) );

        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            String insertQuery = "INSERT INTO `order` (name, dateCreation,solutionName, description, price, carbonFootPrint, project, serviceLevel, idLicense, location)" +
                    "VALUES ('" + newOrder.getName() + "', '" + newOrder.getDateCreation() +"', '" + newOrder.getSolutionName() +"', '" + newOrder.getDescription() +"', " + newOrder.getPrice() +", " + newOrder.getCarbonFootPrint()+", " + idProject + ", " + newOrder.getServiceLevel().getIdService() + ", " + newOrder.getLicense().getIdLicense() +", " + newOrder.getLocation().getIdLocation() +")";

            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    @Override
    public Order updateOrder(Order order ,int orderId) {
        Connection conn = null;
        int contact =0;
        if(order.getContact() != null) contact = order.getContact().getIdContact();
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            int area = Area.convertEnumToInt(order.getLocation().getArea());
            String updateQuery = "UPDATE `order` SET dateCreation='"+ order.getDateCreation() +"', name='" +order.getName() +
                    "', solutionName='" + order.getSolutionName() + "', description='" + order.getDescription() + "', serviceLevel=" + order.getServiceLevel().getIdService() +
                    ", price=" + order.getPrice() + ", carbonFootPrint=" + order.getCarbonFootPrint() +", idLicense=" + order.getLicense().getIdLicense() +
                    ", location=" + order.getLocation().getIdLocation() + ", contact=" + (contact!= 0 ? contact: "null")
                    + " WHERE idOrder = " + orderId;

            stmt.executeUpdate(updateQuery);


            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return order;
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


        if(contact != null )contact.setAvailabilities( getRelatedAvailability(contactId).toArray(Availability[]::new));
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

            //pas besoin de availability, car c'est les availability qui ont des fk sur un seul contact

            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
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
        //On peut juste update dans la table Contact car order et contact sont liés par une FK
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
                Area area = Area.convertIntToEnum(areaValue);
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
    public Order updateLocation(Location location, int orderId) {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            Order oldOrder = getOrder(orderId);
            Double newPrice = oldOrder.getPrice() - oldOrder.getLocation().getBill() + location.getBill();
            newPrice = (double) (Math.round(newPrice * 1000)/1000);
            Double newFootPrint = oldOrder.getCarbonFootPrint() - oldOrder.getLocation().getCarbonFootPrint() + location.getCarbonFootPrint();
            newFootPrint = (double) (Math.round(newFootPrint * 1000)/1000);

            int area = Area.convertEnumToInt(location.getArea());

            String updateQuery = "UPDATE `order` SET location=" + location.getIdLocation()  + ", price="+ newPrice + ", carbonFootPrint = "+ newFootPrint + " WHERE idOrder=" + orderId;
            stmt.executeUpdate(updateQuery);


            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return getOrder(orderId);
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
    public Order updateLicense(License license, int orderId) {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            Order oldOrder = getOrder(orderId);
            Double newPrice = oldOrder.getPrice() - oldOrder.getLicense().getBill() + license.getBill();
            newPrice = (double) (Math.round(newPrice * 1000)/1000);
            Double newFootPrint = oldOrder.getCarbonFootPrint() - oldOrder.getLicense().getCarbonFootPrint() + license.getCarbonFootPrint();
            newFootPrint = (double) (Math.round(newFootPrint * 1000)/1000);

            int licenseLevel = LicenseLevel.convertEnumToInt(license.getLicense());
            String updateQuery = "UPDATE `order` SET idLicense =" + license.getIdLicense()  + ", price="+ newPrice + ", carbonFootPrint = "+ newFootPrint + " WHERE idOrder=" + orderId;
            stmt.executeUpdate(updateQuery);


            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return getOrder(orderId);
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
                availability.setDay(rs.getInt(4));

                availabilities.add(availability);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return availabilities;
    }

    public List<Availability> getRelatedAvailability(int idContact){
        List<Availability> availabilities = new ArrayList<>();
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM availability WHERE idContact=" + idContact);
            while(rs.next()){
                Availability availability = OrderFactory.getInstance().createAvailability();
                availability.setIdAvailability(rs.getInt(1));
                availability.setMorning(rs.getBoolean(2));
                availability.setAfternoon(rs.getBoolean(3));
                availability.setDay(rs.getInt(4));

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
    public int createAvailability(Availability availability, int idContact) {
        int id = -1;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            int day = WeekDay.convertEnumToInt(availability.getDay()) - 1;

            String insertQuery = "INSERT INTO availability (morning, afternoon, day, idContact) VALUES (" + availability.isMorning() + ", " + availability.isAfternoon() + ", " + day + ", " + idContact +")";
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    @Override
    public Availability updateAvailability(Availability availability, int id) {
        //ON peut juste update dans la table availability car contact et availability sont liés par une FK idem pour contact et Order
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            int availabilityDay = WeekDay.convertEnumToInt(availability.getDay());
            //ce qui est vraiment sympa c'est que java converti les bool en int tout seul
            String updateQuery = "UPDATE availability SET " + "morning=" + availability.isMorning() + ", " + "afternoon=" + availability.isAfternoon() + ", " + "day=" + availabilityDay + " " + "WHERE idAvailability=" + id;
            stmt.executeUpdate(updateQuery);


            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        List<Availability> availabilities = getAvailabilities();
        for(Availability l: availabilities) {
            if(l.getIdAvailability() == id) {
                return l;
            }
        }
        return null;
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

    @Override
    public Order updateServiceLevel(Service serviceLevel, int orderId) {
        Connection conn = null;

        Order oldOrder = getOrder(orderId);
        Double newPrice = oldOrder.getPrice() - oldOrder.getServiceLevel().getBill() + serviceLevel.getBill();
        newPrice = (double) (Math.round(newPrice * 1000)/1000);
        Double newFootPrint = oldOrder.getCarbonFootPrint() - oldOrder.getServiceLevel().getCarbonFootPrint() + serviceLevel.getCarbonFootPrint();
        newFootPrint = (double) (Math.round(newFootPrint * 1000)/1000);
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            int level = ServiceLevel.convertEnumToInt(serviceLevel.getLevel());
            String updateQuery="UPDATE `order` SET serviceLevel=" + serviceLevel.getIdService() + ", price="+ newPrice + ", carbonFootPrint = "+ newFootPrint + " WHERE idOrder=" + orderId;
            stmt.executeUpdate(updateQuery);

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return getOrder(orderId);
    }

    @Override
    public Order updateOrderState( State state, int idOrder){
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            int newState = State.convertEnumToInt(state);
            String updateQuery="UPDATE `order` SET state=" + newState;
            stmt.executeUpdate(updateQuery);

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return getOrder(idOrder);
    }

    @Override
    public Project getProject(int idProject) {
        Project project = null;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM project WHERE idProject = " + idProject);
            while(rs.next()){
                project = OrderFactory.getInstance().createProject();
                project.setIdProject(rs.getInt(1));
                project.setName(rs.getString(2));

            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return project;
    }


}
