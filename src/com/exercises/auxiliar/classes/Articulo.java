package com.exercises.auxiliar.classes;


public class Articulo {

    private String nombre;
    private String referencia;
    private Double precio;

    public Articulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "[ " + nombre + " , " + referencia + " , " + precio + " ]";
    }
}
