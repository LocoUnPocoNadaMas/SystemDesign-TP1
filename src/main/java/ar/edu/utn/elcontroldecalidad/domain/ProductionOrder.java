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

    public ProductionOrder(Line line, Model model, SupervisorLine supLine, Status status) {
        this.line = line;
        this.model = model;
        this.supLine = supLine;
        this.status = status;
    }

    public Line getLine() {
        return line;
    }

    public Model getModel() {
        return model;
    }

    public SupervisorLine getSupLine() {
        return supLine;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }    
}
