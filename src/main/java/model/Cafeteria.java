package model;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private List<Cafe> cafes;
    private String nombre, direccion, codCafeteria;
    private RedSocial redSocial;

    public Cafeteria(String codCafeteria, String nombre, String direccion, RedSocial redSocial) {
        this.codCafeteria = codCafeteria;
        this.nombre = nombre;
        this.direccion = direccion;
        this.redSocial = redSocial;
        this.cafes = new ArrayList<Cafe>();

    }

    public String getCodCafeteria() {
        return codCafeteria;
    }

    public void setCodCafeteria(String codCafeteria) {
        this.codCafeteria = codCafeteria;
    }

    public List<Cafe> getCafes() {
        return cafes;
    }

    public void setCafes(List<Cafe> cafes) {
        this.cafes = cafes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public RedSocial getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(RedSocial redSocial) {
        this.redSocial = redSocial;
    }
}
