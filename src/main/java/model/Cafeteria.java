package model;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private List<Cafe> cafes;
    private String nombre, direccion;
    private RedSocial redSocial;

    public Cafeteria(String nombre, String direccion, RedSocial redSocial) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redSocial = redSocial;
        this.cafes = new ArrayList<Cafe>();

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
