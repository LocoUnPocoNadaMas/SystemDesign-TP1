package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public class SupervisorLine extends Employee{

    public SupervisorLine(Integer dni, String surnameName, String email, String user, String pass) {
        super(dni, surnameName, email, user, pass);
    }

    public void changeProductionOrderStatus(){
        
    }
}
