package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public class SupervisorLine extends Employee{

    public SupervisorLine(Integer dni, String surnameName, String email, Credentials cred) {
        super(dni, surnameName, email, cred);
    }
    
     public SupervisorLine(Employee empl) {
        super(empl.getDni(), empl.getSurnameName(), empl.getEmail(), empl.getCred());
    }
    
    public void changeProductionOrderStatus(){
    }
}
