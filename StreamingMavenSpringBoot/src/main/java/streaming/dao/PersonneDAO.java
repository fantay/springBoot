/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import streaming.entity.Personne;

/**
 *
 * @author Laurent-LIM
 */

@Repository
public class PersonneDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    //ajouter
    @Transactional
    public void ajouter(Personne p){
        em.persist(p);
    }
    
    //lister tout
    public List<Personne> personnes(){
        return em.createQuery("SELECT p FROM Personne p ORDER BY p.nom").getResultList();
    }
}
