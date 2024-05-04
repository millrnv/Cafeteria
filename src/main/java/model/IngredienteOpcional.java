package model;

public enum IngredienteOpcional {

    CREMA("Crema"), LECHE("Leche"), CHOCOLATE("Chocolate");

    private String nombre;

    private IngredienteOpcional(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
