package fr.isen.ordersmanagement.services.impl;

import fr.isen.ordersmanagement.factories.OrganisationFactory;
import fr.isen.ordersmanagement.interfaces.model.Folder;
import fr.isen.ordersmanagement.interfaces.model.Organisation;
import fr.isen.ordersmanagement.interfaces.model.Project;
import fr.isen.ordersmanagement.interfaces.services.IOrganisationService;
import io.agroal.api.AgroalDataSource;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.ws.rs.Path;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
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

        organisation.setFolders(getRelatedFolders(organisation.getIdOrganisation()));
        return organisation;
    }

    Folder[] getRelatedFolders(int idOrganisation){
        ArrayList<Folder> folders = new ArrayList<Folder>();
        Connection conn = null;

        try{
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `folder` WHERE idorganisation = " + idOrganisation);
            while(rs.next()){
                Folder temporary = new Folder();
                temporary.setIdfolder(rs.getInt(1));
                temporary.setName(rs.getString(2));

                folders.add(temporary);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        for (Folder f: folders) {
            f.setProjects(getRelatedProject(f.getIdfolder()));
        }

        return folders.toArray(Folder[]::new);
    }

    Project[] getRelatedProject(int idFolder){
        ArrayList<Project> projects = new ArrayList<Project>();
        Connection conn = null;

        try{
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `project` WHERE idFolder = " + idFolder);
            while(rs.next()){
                Project temporary = new Project();
                temporary.setIdProject(rs.getInt(1));
                temporary.setName(rs.getString(2));

                projects.add(temporary);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return projects.toArray(Project[]::new);
    }

}
