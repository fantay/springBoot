/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;


/**
 *
 * @author Laurent-LIM
 */
public interface FilmServiceCRUD extends CrudRepository<Film, Long> {

    //1. Le film pour un titre donné
    public Film findOneByTitre(String titre);

    //2. Les films pour une année donnée
    public List <Film> findAllByAnnee(Integer annee);
    
    //3. Les films pour un titre donné ou un année donnée
    public List <Film> findAllByTitreOrAnnee(String titre, Integer annee);
    
    //4. Les films pour un titre et une année donnée
    public List <Film> findAllByTitreAndAnnee(String titre, Integer annee);
    
    //5. Les films pour un genre id donné
    public List <Film> findAllByGenreId(Long genre_id);
    
    //6. Les films pour un pays id donnée
    public List <Film> findAllByPaysId(Long pays_id);
    
    //7. Les films pour un genre id et un pays id donnés
    public List <Film> findAllByGenreIdAndPaysId(Long genre_id, Long pays_id);
    
    //8. Les films pour un acteur(nom/prénom) donné
    public List <Film> findAllByActeursNomAndActeursPrenom(String nom, String prenom);
    
    //9. Le nombre de films pour un acteur donné
    public Long countByActeursNomAndActeursPrenom(String nom, String prenom);
    
    //10. Les films pour un réalisateur donné, classés par titre
    public List <Film> findAllByRealisateursNomAndRealisateursPrenomOrderByTitreAsc(String nom, String prenom);
    
    //11. Le nombre de films pour un réalisateur donné
    public Long countByRealisateursNomAndRealisateursPrenom(String nom, String prenom);
    
    //12. Les films d'un pays donné, pour un genre donné, un réalisateur donné et un acteur donné
    public List <Film> findAllByPaysNomAndGenreIdAndRealisateursNomAndRealisateursPrenomAndActeursNomAndActeursPrenom(String nom_pays, Long genre_id, String nom_realisteur, String prenom_realisateur, String nom_acteur, String prenom_acteur);
    

}
