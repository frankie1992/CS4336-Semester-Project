package ejb;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;
import java.util.*;
import entity.Theater;
/**
 *
 * @author Francisco
 */
@Stateless
public class TheaterEJB {

    @PersistenceContext
    private EntityManager em;
    //Gets all theaters
    public List<Theater> getAllTheater(){
        return em.createNamedQuery("Theater.getAll", Theater.class).getResultList();
    }
    //Get theaters by zip code
    public List<Theater> searchByZip(String zip){
        return em.createNamedQuery("Theater.searchByZip", Theater.class).setParameter("zip", zip).getResultList();
    }
    //Gte theater by ID
    public Theater searchByID(Long id){
        return em.createNamedQuery("Theater.searchByID", Theater.class).setParameter("id", id).getSingleResult();
    }
}
