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
    
    public void startProductionOrderStatus(Line line, Model model, SupervisorLine sup){
        ProductionOrder productionOrder = new ProductionOrder(line, model, sup, Status.START);
        FakeData.getInstance().getProdOrder().add(productionOrder);
    }
    
    public void pauseProductionOrderStatus(ProductionOrder pOrder){
        pOrder.setStatus(Status.PAUSE);
    }
    
    public void continueProductionOrderStatus(ProductionOrder pOrder){
        pOrder.setStatus(Status.CONTINUE);
    }
    
    public void endProductionOrderStatus(ProductionOrder pOrder){
        pOrder.setStatus(Status.END);
    }
}
