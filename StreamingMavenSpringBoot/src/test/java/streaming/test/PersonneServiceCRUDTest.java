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
import streaming.entity.Personne;
import streaming.service.PersonneServiceCRUD;
import streaming.spring.SpringConfig;

/**
 *
 * @author Laurent-LIM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)

public class PersonneServiceCRUDTest {
    
    @Autowired
    private PersonneServiceCRUD psc;
    
    @Before
    public void setUp() {
        psc.deleteAll();
        Personne p = new Personne();
        p.setNom("Tintin");
        p.setPrenom("Milou");
        psc.save(p);
    }
    
    @Test
    public void findOneOK(){
       Personne p = psc.findOneByPrenomAndNom("Milou", "Tintin");
       Assert.assertEquals("Tintin", p.getNom());
       Assert.assertEquals("Milou", p.getPrenom());
    }
    
    
    
    
}
