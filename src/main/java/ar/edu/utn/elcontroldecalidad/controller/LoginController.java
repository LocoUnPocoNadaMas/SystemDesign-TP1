package ar.edu.utn.elcontroldecalidad.controller;

import ar.edu.utn.elcontroldecalidad.test.FakeData;
import ar.edu.utn.elcontroldecalidad.view.Login;
import ar.edu.utn.elcontroldecalidad.view.Menu;

/**
 * Controlador de la vista de inicio de sesión
 *
 * @author Pato
 */
public class LoginController {

    private static FakeData fakeData = new FakeData();

    private static LoginController INSTANCE;
    
    private static Login login;

    private LoginController() {
    }

    public static LoginController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LoginController();
        }

        return INSTANCE;
    }

    public void showForm() {
        login = new Login();
        login.setVisible(true);
    }
    
    //StartProduction form = null;

    public void checkCredetials(String user, String pass) {
        //final Menu form;
        if (user.isEmpty()) {
            System.err.println("ingrese usuario");
            return;
        }
        if (pass.isEmpty()) {
            System.err.println("ingrese contraseña");
            return;
        }
        if (fakeData.getSupLines() == null) {
            System.err.println("nullllll");
        } else {
            System.err.println("fake data being feke data");
            fakeData.getSupLines().forEach((sup) -> {
                if (sup.getPass().equals(pass) && sup.getUser().equals(user)) {
                    startProduction();
                }
            });
            fakeData.getSupQuals().forEach((sup) -> {
                if (sup.getPass().equals(pass) && sup.getUser().equals(user)) {

                }
            });
        }
    }
    
    private void startProduction(){
        login.dispose();
        Menu prod = new Menu();
        prod.setVisible(true);
    }
}
