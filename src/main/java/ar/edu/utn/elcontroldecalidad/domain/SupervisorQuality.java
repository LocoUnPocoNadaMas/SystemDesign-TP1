package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public class SupervisorQuality extends Employee{

    public SupervisorQuality(Integer dni, String surnameName, String email, Credentials cred) {
        super(dni, surnameName, email, cred);
    }

    public SupervisorQuality(Employee empl) {
        super(empl.getDni(), empl.getSurnameName(), empl.getEmail(), empl.getCred());
    }
}
