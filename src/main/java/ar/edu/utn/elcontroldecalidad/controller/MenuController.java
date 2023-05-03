package ar.edu.utn.elcontroldecalidad.controller;

import ar.edu.utn.elcontroldecalidad.domain.Employee;
import ar.edu.utn.elcontroldecalidad.domain.SupervisorLine;
import ar.edu.utn.elcontroldecalidad.domain.SupervisorQuality;
import ar.edu.utn.elcontroldecalidad.view.Menu;

/**
 * Controlador de la vista Menú
 *
 * @author Pato
 */
public final class MenuController {

    //private SupervisorLine sLine;
    //private SupervisorQuality sQuality;
    private Employee employee;
    private boolean uwu;
    private SupervisorLine supLine;

    public MenuController(Employee employee) {
        System.err.println("instance of menu controller");
        this.employee = employee;

        switch (this.employee.getCred().getRole()) {
            case QUALITY -> {
                var sup = new SupervisorQuality(employee);
                showSupervisorQuality();
            }
            case LINE -> {
                supLine = new SupervisorLine(employee);
                Menu prod = new Menu(supLine);
                prod.setVisible(true);
            }
            default ->
                System.err.println("Usuario Invalido");
        }
    }
/*
    private void showSupervisorLine() {
        Menu prod = new Menu();
        prod.setVisible(true);
    }*/

    private void showSupervisorQuality() {
        Menu prod = new Menu();
        prod.getBtnStartProdOrder().setEnabled(false);
        prod.setVisible(true);
    }

}
