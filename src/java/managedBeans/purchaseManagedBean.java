/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
/**
 *
 * @author Francisco
 */
@Named(value = "purchaseManagedBean")
@SessionScoped
public class purchaseManagedBean implements Serializable{
    
    private int tickets;
    private String firstName;
    private String lastName;
    private String email;
    private String CCnum;
    private String zip;
    
    public purchaseManagedBean() {
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCCnum() {
        return CCnum;
    }

    public void setCCnum(String CCnum) {
        this.CCnum = CCnum;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public void validateCC(FacesContext context, UIComponent comp, Object value) {

        String cc = (String) value;

        if (cc.length() != 16) {
            ((UIInput) comp).setValid(false);

            FacesMessage message = new FacesMessage(
                    "Invalid Credit Card");
            context.addMessage(comp.getClientId(context), message);

        }
    }
    
    public void validateZip(FacesContext context, UIComponent comp, Object value) {

        String cc = (String) value;

        if (cc.length() != 5) {
            ((UIInput) comp).setValid(false);

            FacesMessage message = new FacesMessage(
                    "Invalid Zipcode");
            context.addMessage(comp.getClientId(context), message);

        }
    }
    
    public int totalCost(int tickets){
        return tickets * 10;
    }
}
