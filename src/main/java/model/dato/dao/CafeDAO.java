package model.dato.dao;

import model.Cafe;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;


public class CafeDAO {

    public static void agregarCafe(DSLContext query, Cafe cafe){
        Table tablaCafe = table(name("Cafe"));
        Field[] columnas = tablaCafe.fields("codCafe","gramosCafe","mlAgua","tamanio","ingredientes");
        query.insertInto(tablaCafe, columnas[0], columnas[1],columnas[2],columnas[3],columnas[4]).values(cafe.getCodCafe(),cafe.getGramosCafe(),cafe.getMlAgua(),cafe.getTamanio(),cafe.getIngredientes()).execute();
    }

    public void eliminarCafe(DSLContext query, String codCafe){
        Table tablaCafe= table(name("Cafe"));
        query.delete(DSL.table("Cafe")).where(DSL.field("codCafe").eq(codCafe)).execute();
    }

}
