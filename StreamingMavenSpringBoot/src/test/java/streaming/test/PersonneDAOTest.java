/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.PersonneDAO;
import streaming.entity.Personne;
import streaming.spring.SpringConfig;

/**
 *
 * @author Laurent-LIM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class PersonneDAOTest {

    @Before
    public void setUp() {
    }
    
    @Autowired
    private PersonneDAO pdao;
    
    //@Test
    public void ajouter(){
        Personne p = new Personne();
        p.setNom("Tintin");
        pdao.ajouter(p);
    }
    
    @Test
    public void lister(){
        Assert.assertTrue(pdao.personnes().size()>17);
    }
    
    
    
}
