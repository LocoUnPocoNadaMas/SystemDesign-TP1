package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public class Credentials {
    private String user;
    private String pass;
    private enum Role {
        LINE,
        QUALITY
    };
}
