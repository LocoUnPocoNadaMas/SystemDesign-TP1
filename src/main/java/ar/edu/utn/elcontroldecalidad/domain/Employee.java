package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public abstract class Employee {
    private Integer dni;
    private String surnameName;
    private String email;
    private String user;
    private String pass;

    public Employee(Integer dni, String surnameName, String email, String user, String pass) {
        this.dni = dni;
        this.surnameName = surnameName;
        this.email = email;
        this.user = user;
        this.pass = pass;
    }

    public Integer getDni() {
        return dni;
    }

    public String getSurnameName() {
        return surnameName;
    }

    public String getEmail() {
        return email;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    
}
