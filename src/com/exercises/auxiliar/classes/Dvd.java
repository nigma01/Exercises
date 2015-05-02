package com.exercises.auxiliar.classes;


public class Dvd extends Articulo {

    private String realizador;
    private String duracion;

    public Dvd() {
    }

    public String getRealizador() {
        return realizador;
    }

    public void setRealizador(String realizador) {
        this.realizador = realizador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + "[ " + realizador + " , " + duracion  + " ]";
    }
}
