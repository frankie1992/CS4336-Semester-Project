/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public List<Theater> getAllTheater(){
        return em.createNamedQuery("Theater.getAll", Theater.class).getResultList();
    }
    
    public List<Theater> searchByZip(String zip){
        return em.createNamedQuery("Theater.searchByZip", Theater.class).setParameter("zip", zip).getResultList();
    }
    
    public Theater searchByID(Long id){
        return em.createNamedQuery("Theater.searchByID", Theater.class).setParameter("id", id).getSingleResult();
    }
}
