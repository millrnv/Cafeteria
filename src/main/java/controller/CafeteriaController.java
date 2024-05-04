package controller;

import model.Cafeteria;
import model.IngredienteOpcional;
import model.RedSocial;
import model.dato.DBConnector;
import model.dato.DBGenerator;
import model.dato.dao.CafeteriaDAO;
import org.jooq.DSLContext;

public class CafeteriaController {

    public static boolean añadirCafeteria(String codCafeteria, String nombre, String direccion, RedSocial redSocial) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Cafeteria");
        if(!CafeteriaDAO.validarExistenciaCafeteria(query,"codigo",codCafeteria)){
            Cafeteria cafeteria = new Cafeteria(codCafeteria, nombre, direccion, redSocial);
            CafeteriaDAO.agregarCafeteria(query,cafeteria);
            DBConnector.closeConnection();
            return true;
        }
        else{
            return false;
        }
    }

    public static Object[] getCodigoCafeterias() throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Cafeteria");
        Object[] cafeterias = CafeteriaDAO.getCodigoCafeteria(query);
        DBConnector.closeConnection();
        return cafeterias;
    }


}
