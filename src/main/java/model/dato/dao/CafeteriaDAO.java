package model.dato.dao;

import model.Cafeteria;
import model.RedSocial;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;

import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class CafeteriaDAO {

    public static void agregarCafeteria(DSLContext query, Cafeteria cafeteria){
        Table tablaCafeteria= table(name("Cafeteria"));
        Field[] columnas = tablaCafeteria.fields("cod_cafeteria","nombre","direccion", "redSocial");
        query.insertInto(tablaCafeteria, columnas[0], columnas[1],columnas[2], columnas[4]).values(cafeteria.getCodCafeteria(),cafeteria.getNombre(),cafeteria.getDireccion(), cafeteria.getRedSocial()).execute();
    }

    public static boolean validarExistenciaCafeteria(DSLContext query,String columnaTabla, Object dato){
        Result resultados = query.select().from(table("Cafeteria")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        if(resultados.size()>=1){
            return true;
        }
        else{
            return false;
        }
    }

    public static Cafeteria buscarCafeteria(DSLContext query, Object dato){
        Result resultados= (Result) buscarCafeteria(query,"codigo",dato);
        String codigoCafeteria = (String) resultados.getValue(0,"codigo");
        String nombreCafeteria = (String) resultados.getValue(0,"nombre_cafeteria");
        String direccionCafeteria = (String) resultados.getValue(0,"direccion_cafeteria");
        RedSocial redSocial = (RedSocial) resultados.getValue(0,"red_social");
        return new Cafeteria(codigoCafeteria,nombreCafeteria,direccionCafeteria,redSocial);
    }

    public static List buscarCafeteria(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(table("Cafeteria")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        return resultados;
    }

    public static Object[] getCodigoCafeteria(DSLContext query){
        Table cafeteria= table("Cafeteria");
        Result resultados = query.select(cafeteria.field("codigo")).from(cafeteria).fetch();
        if(resultados.size()==0){
            return new String[]{"Error no existen cafeterias"};
        }
        else {
            return resultados.getValues("codigo").toArray();
        }
    }

}
