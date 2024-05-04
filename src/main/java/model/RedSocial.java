package model;

public enum RedSocial {

    INSTAGRAM("Instagram"), FACEBOOK("Facebook"), TWITTER("Twitter");

    private String nombre;

    private RedSocial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
