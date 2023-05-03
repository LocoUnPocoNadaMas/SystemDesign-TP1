package ar.edu.utn.elcontroldecalidad.domain;

/**
 *
 * @author Pato
 */
public class Line {
    private Integer number;
    private String description;

    public Line(Integer number, String description) {
        this.number = number;
        this.description = description;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
