/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlProducer;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.InputSource;
import streaming.entity.Film;
import streaming.spring.SpringConfig;
import streaming.service.FilmServiceCRUD;

/**
 *
 * @author Laurent-LIM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class FilmServiceCRUDTest {

    @Autowired
    private FilmServiceCRUD service;

    @Before
    public void setUp() throws ClassNotFoundException, SQLException, DatabaseUnitException, FileNotFoundException {
        // Connexion DB
        Class driverClass = Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/sample", "app", "app");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);

        // Import
        FlatXmlDataSet dataSet = new FlatXmlDataSet(new FlatXmlProducer(new InputSource(new FileInputStream("donnees.xml"))));
        DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
    }

    //1. Le film pour un titre donné
    @Test
    public void filmtitredonne(){
        
    }
    
    
    
//2. Les films pour une année donnée
//    3. Les films pour un titre donné ou un année donnée
//
//    4. Les films pour un titre et une année donnée
//
//    5. Les films pour un genre id donné
//
//    6. Les films pour un pays id donnée
//
//    7. Les films pour un genre id et un pays id donnés
//
//    8. Les films pour un acteur(nom/prénom) donné
//
//9. Le nombre de films pour un acteur donné
//
//10. Les films pour un réalisateur donné, classés par titre
//
//11. Le nombre de films pour un réalisateur donné
//
//12. Les films d'un pays donné, pour un genre donné, un réalisateur donné et un acteur donné
//
//13. Tous les liens d'un film donné
//
//14. Toutes les saisons d'une série donnée classées par ordre
//
//15. Tous les épisodes d'une saison donnée d'une série donnée, classés par ordre
//
//16. Tous les liens d'un numéro d'épisode d'un numéro de saison d'une série donnée



}
