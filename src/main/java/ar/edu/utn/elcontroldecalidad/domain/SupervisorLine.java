package ar.edu.utn.elcontroldecalidad.domain;

import ar.edu.utn.elcontroldecalidad.domain.enums.Status;
import ar.edu.utn.elcontroldecalidad.test.FakeData;

/**
 *
 * @author Pato
 */
public class SupervisorLine extends Employee{
    
    public SupervisorLine(Integer dni, String surnameName, String email, Credentials cred) {
        super(dni, surnameName, email, cred);
    }
    
     public SupervisorLine(Employee empl) {
        super(empl.getDni(), empl.getSurnameName(), empl.getEmail(), empl.getCred());
    }
    /*
    public void startProductionOrderStatus(Line line, Model model, SupervisorLine sup){
        ProductionOrder productionOrder = new ProductionOrder(line, model, sup, Status.INICIADO);
        FakeData.getInstance().getProdOrder().add(productionOrder);
    }*/
    
    public void pauseProductionOrderStatus(ProductionOrder pOrder){
        pOrder.setStatus(Status.PAUSADO);
    }
    
    public void continueProductionOrderStatus(ProductionOrder pOrder){
        pOrder.setStatus(Status.CONTINUADO);
    }
    
    public void endProductionOrderStatus(ProductionOrder pOrder){
        pOrder.setStatus(Status.FINALIZADO);
    }

    public ProductionOrder startProductionOrderStatus(Line line, Model model) {
        ProductionOrder productionOrder = new ProductionOrder(line, model, this, Status.INICIADO);
        FakeData.getInstance().getProdOrder().add(productionOrder);
        return productionOrder;
    }
}
