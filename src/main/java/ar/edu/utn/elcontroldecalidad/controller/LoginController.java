package ar.edu.utn.elcontroldecalidad.controller;

import ar.edu.utn.elcontroldecalidad.domain.Employee;
import ar.edu.utn.elcontroldecalidad.test.FakeData;
import ar.edu.utn.elcontroldecalidad.view.Login;

/**
 * Controlador de la vista de inicio de sesión
 *
 * @author Pato
 */
public class LoginController {
        
//private static FakeData fakeData = new FakeData();
        private static Login login;
    //private MenuController menuController;

    private static LoginController INSTANCE;
    

    private LoginController() {
        System.err.println("Instance of Log");
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
        var fakeData = FakeData.getInstance();
        //final Menu form;
        if (user.isEmpty()) {
            System.err.println("ingrese usuario");
            return;
        }
        if (pass.isEmpty()) {
            System.err.println("ingrese contraseña");
            return;
        }
        if (fakeData == null) {
            System.err.println("falta fakeData");
        } else {
            //System.err.println("fake data being feke data");
            fakeData.getEmployees().forEach((empl) -> {
                if (empl.getCred().getPass().equals(pass) && empl.getCred().getUser().equals(user)) {
                    startProduction(empl);
                }
            });
        }
    }

    private void startProduction(Employee empl) {
        if (null == empl) {
            System.err.println("Usuario Invalido");
        } else {
            login.dispose();
            MenuController menu = new MenuController(empl);
        }
    }
}
