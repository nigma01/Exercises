package com.exercises.auxiliar.classes.claseshijas;


import com.exercises.auxiliar.classes.Articulo;

public class Dvd extends Articulo {

    private Realizador realizador;
    private String duracion;

    public Dvd() {
    }

    public Realizador getRealizador() {
        return realizador;
    }

    public void setRealizador(Realizador realizador) {
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
        return super.toString() + "[ " + getRealizador() + " , " + getDuracion()  + " ]";
    }
}
