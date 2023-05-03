package ar.edu.utn.elcontroldecalidad;

import ar.edu.utn.elcontroldecalidad.controller.LoginController;

/**
 *
 * @author Pato
 */
public class ElControlDeCalidad {

    //private Login login;

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        LoginController.getInstance().showForm();
    }
}
