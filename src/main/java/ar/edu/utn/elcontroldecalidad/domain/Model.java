package ar.edu.utn.elcontroldecalidad.domain;

import java.util.List;

/**
 *
 * @author Pato
 */
public class Model {
    private String sku;
    private String denomination;
    private List<Color> colors;

    public Model(String sku, String denomination, List<Color> colors) {
        this.sku = sku;
        this.denomination = denomination;
        this.colors = colors;
    }
    
    public String getSku() {
        return sku;
    }

    public String getDenomination() {
        return denomination;
    }

    public List<Color> getColors() {
        return colors;
    }
}
