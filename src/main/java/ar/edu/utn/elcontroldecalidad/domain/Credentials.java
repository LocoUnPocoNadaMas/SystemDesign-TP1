package ar.edu.utn.elcontroldecalidad.domain;

import ar.edu.utn.elcontroldecalidad.domain.enums.Role;

/**
 *
 * @author Pato
 */
public class Credentials {

    private String user;
    private String pass;
    private Role role;

    public Credentials(String user, String pass, Role role) {
        this.user = user;
        this.pass = pass;
        this.role = role;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
