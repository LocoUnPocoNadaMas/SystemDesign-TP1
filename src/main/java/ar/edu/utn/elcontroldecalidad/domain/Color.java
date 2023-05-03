package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public class Color {
    private String code;
    private String description;

    public Color(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
