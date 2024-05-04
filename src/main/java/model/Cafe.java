package model;

public class Cafe {

    private double gramosCafe, mlAgua, tamanio;
    private IngredienteOpcional ingredientes;

    public Cafe(double gramosCafe, double mlAgua, double tamanio, IngredienteOpcional ingredientes) {
        this.gramosCafe = gramosCafe;
        this.mlAgua = mlAgua;
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;
    }

    public double getGramosCafe() {
        return gramosCafe;
    }

    public void setGramosCafe(double gramosCafe) {
        this.gramosCafe = gramosCafe;
    }

    public double getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(double mlAgua) {
        this.mlAgua = mlAgua;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public IngredienteOpcional getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(IngredienteOpcional ingredientes) {
        this.ingredientes = ingredientes;
    }
}
