/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import entity.Movie;
/**
 *
 * @author Francisco
 */
@Stateless
public class MovieEJB {

    @PersistenceContext
    private EntityManager em;
    
    public List<Movie> getAll(){
        return em.createNamedQuery("Movie.getAll", Movie.class).getResultList();
    }
    
    public List<Movie> getAllTheaterMovies(Long id){
        return em.createNamedQuery("Movie.getTheaterMovies", Movie.class).setParameter("id", id).getResultList();
    }
    
    public Movie searchByID(Long id){
        return em.createNamedQuery("Movie.searchByID", Movie.class).setParameter("id", id).getSingleResult();
    }
}
