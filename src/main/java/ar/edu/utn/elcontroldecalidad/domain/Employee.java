package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public class Employee {
    private Integer dni;
    private String surnameName;
    private String email;
    private Credentials cred;

    public Employee(Integer dni, String surnameName, String email, Credentials cred) {
        this.dni = dni;
        this.surnameName = surnameName;
        this.email = email;
        this.cred = cred;
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

    public Credentials getCred() {
        return cred;
    }
}
