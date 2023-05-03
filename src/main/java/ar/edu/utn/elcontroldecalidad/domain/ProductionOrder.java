package ar.edu.utn.elcontroldecalidad.domain;

import ar.edu.utn.elcontroldecalidad.domain.enums.Status;

/**
 *
 * @author Pato
 */
public class ProductionOrder {
    
    private Line line;
    private Model model;
    private SupervisorLine supLine;
    private Status status;
}
