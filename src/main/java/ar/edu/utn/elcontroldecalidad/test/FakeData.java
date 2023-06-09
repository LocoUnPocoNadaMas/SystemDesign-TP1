package ar.edu.utn.elcontroldecalidad.test;

import ar.edu.utn.elcontroldecalidad.domain.Color;
import ar.edu.utn.elcontroldecalidad.domain.Credentials;
import ar.edu.utn.elcontroldecalidad.domain.Employee;
import ar.edu.utn.elcontroldecalidad.domain.Line;
import ar.edu.utn.elcontroldecalidad.domain.Model;
import ar.edu.utn.elcontroldecalidad.domain.ProductionOrder;
import ar.edu.utn.elcontroldecalidad.domain.enums.Role;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase creada para suplir la falta de persistencia, y como no sé testing no queda otra.
 * 
 * @author Pato
 */
public class FakeData {
    
    /*
    private List<SupervisorLine> supLines = new ArrayList();
    private List<SupervisorQuality> supQuals = new ArrayList();
*/
    private List<Employee> employees = new ArrayList();
    private List<Color> colors = new ArrayList();
    private List<Line> lines = new ArrayList();
    private List<Model> models = new ArrayList();
    private List<ProductionOrder> prodOrder = new ArrayList();
    
    private static FakeData INSTANCE;    
    
    public static FakeData getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new FakeData();
        }
        
        return INSTANCE;
    }

    private FakeData() {
        System.err.println("Instance of fakeData");
        var cred = new Credentials("linea", "123", Role.LINE);
        var supLine = new Employee(12345678, "Brito Alan", "alanbrito@uwu.com", cred);
        var cred1 = new Credentials("calidad", "321", Role.QUALITY);
        var supQual = new Employee(23456789, "Paredes Armando", "armandoparedes@uwu.com", cred1);
        //this.supLines.add(supLine);
        //this.supQuals.add(supQual);
        this.employees.add(supLine);
        this.employees.add(supQual);
        //rojo, naranja, amarillo, verde, azul, índigo y violeta.
        var color = new Color("01", "rojo");
        this.colors.add(color);
        var color1 = new Color("02", "naranja");
        this.colors.add(color1);
        var color2 = new Color("03", "amarillo");
        this.colors.add(color2);
        var color3 = new Color("04", "verde");
        this.colors.add(color3);
        var color4 = new Color("05", "azul");
        this.colors.add(color4);
        var color5 = new Color("06", "índigo");
        this.colors.add(color5);
        var color6 = new Color("07", "violeta");
        this.colors.add(color6);
        var color7 = new Color("08", "blanco");
        this.colors.add(color7);
        var color8 = new Color("09", "negro");
        this.colors.add(color8);
        var line = new Line(1, "primera");
        var line1 = new Line(2, "segunda");
        this.lines.add(line);
        this.lines.add(line1);
        var aux = new ArrayList<Color>();
        aux.add(color6);
        aux.add(color4);
        aux.add(color7);
        var aux1 = new ArrayList<Color>();
        aux1.add(color8);
        aux1.add(color7);
        var aux2 = new ArrayList<Color>();
        aux1.add(color1);
        aux1.add(color2);
        aux1.add(color3);
        aux1.add(color4);
        aux1.add(color7);
        var model = new Model("sku01", "elmejor", aux);
        var model1 = new Model("sku02", "bastantebueno", aux1);
        var model2 = new Model("sku03", "podriamejorar", aux2);
        this.models.add(model);
        this.models.add(model1);
        this.models.add(model2);
    }
/*
    public List<SupervisorLine> getSupLines() {
        return supLines;
    }

    public List<SupervisorQuality> getSupQuals() {
        return supQuals;
    }
*/
    public List<Color> getColors() {
        return colors;
    }

    public List<Line> getLines() {
        return lines;
    }

    public List<Model> getModels() {
        return models;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<ProductionOrder> getProdOrder() {
        return prodOrder;
    }
}
