/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.data.repository.CrudRepository;
import streaming.entity.Personne;

/**
 *
 * @author Laurent-LIM
 */
public interface PersonneServiceCRUD extends CrudRepository<Personne, Long>{
    
    public Personne findOneByPrenomAndNom(String p, String n);
    
    
}