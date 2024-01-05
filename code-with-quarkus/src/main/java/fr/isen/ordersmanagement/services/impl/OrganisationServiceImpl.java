package fr.isen.ordersmanagement.services.impl;

import fr.isen.ordersmanagement.factories.OrganisationFactory;
import fr.isen.ordersmanagement.interfaces.model.Organisation;
import fr.isen.ordersmanagement.interfaces.services.IOrganisationService;
import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.ws.rs.Path;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class OrganisationServiceImpl implements IOrganisationService {

    AgroalDataSource dataSource = CDI.current().select(AgroalDataSource.class).get();

    @Override
    public Organisation getOrganisation(int organisationId) {
        Organisation organisation = null;
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT idorganisation, orgname FROM organisation WHERE idorganisation = " + organisationId);
            while(rs.next()){
                organisation = OrganisationFactory.getInstance().createOrganisation();
                System.out.println(rs.getInt(1));
                organisation.setIdOrganisation(rs.getInt(1));
                organisation.setName(rs.getString(2));
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return organisation;
    }

}
