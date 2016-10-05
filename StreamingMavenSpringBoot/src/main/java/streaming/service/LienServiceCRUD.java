/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Lien;

/**
 *
 * @author Laurent-LIM
 */
public interface LienServiceCRUD extends CrudRepository<Lien, Long> {

    //13. Tous les liens d'un film donné
    public List<Lien> findAllByFilmTitre(String titre_film);

    //16. Tous les liens d'un numéro d'épisode d'un numéro de saison d'une série donnée
    public List <Lien> findAllByEpisodeNumEpisodeAndEpisodeSaisonNumSaisonAndEpisodeSaisonSerieTitre(Integer numero_episode, Integer numero_saison, String titre_serie);
    
}
