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
    //gets all movies
    public List<Movie> getAll(){
        return em.createNamedQuery("Movie.getAll", Movie.class).getResultList();
    }
    //gets all movies at a theater
    public List<Movie> getAllTheaterMovies(Long id){
        return em.createNamedQuery("Movie.getTheaterMovies", Movie.class).setParameter("id", id).getResultList();
    }
    //Gets a movie by id
    public Movie searchByID(Long id){
        return em.createNamedQuery("Movie.searchByID", Movie.class).setParameter("id", id).getSingleResult();
    }
}
