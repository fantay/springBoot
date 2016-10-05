/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.spring.SpringConfig;

/**
 *
 * @author Laurent-LIM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class FilmDAOTest {
    
    @Autowired
    private FilmDAO dao;
    
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void ajouter2Films(){
        
        dao.save(new Film());
        dao.save(new Film());
    }
    
    
}
