/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import ejb.TheaterEJB;
import entity.Theater;


/**
 *
 * @author Francisco
 */
@Named(value = "theaterManagedBean")
@SessionScoped
public class theaterManagedBean implements Serializable{

    @Inject
    TheaterEJB theaterEJB;
    
    private String zip;
    private Long theaterID;
    private List<Theater> theaterList;
    private Theater selectedTheater;
    
    public theaterManagedBean() {
    }

    public TheaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(TheaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public void setTheaterList(List<Theater> theaterList) {
        this.theaterList = theaterList;
    }

    public Theater getSelectedTheater() {
        return selectedTheater;
    }

    public void setSelectedTheater(Theater selectedTheater) {
        this.selectedTheater = selectedTheater;
    }

    public Long getTheaterID() {
        return theaterID;
    }

    public void setTheaterID(Long theaterID) {
        this.theaterID = theaterID;
    }

    public String searchID(){
        selectedTheater = theaterEJB.searchByID(theaterID);
        return "movieTheater";
    }
    
    public void searchZip(){
        theaterList = theaterEJB.searchByZip(zip);
    }
    
    public String getAll(){
        theaterList = theaterEJB.getAllTheater();
        return "findTheater";
    }
}
