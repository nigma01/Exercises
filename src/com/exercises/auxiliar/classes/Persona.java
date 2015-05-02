package com.exercises.auxiliar.classes;

import java.util.Date;

/**
 * Created by David on 02/05/2015.
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private Date  fechaNacimiento;

    public Persona(String nombre, String apellidos, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "[ " + " , " + getNombre()  + " , " +  getApellidos() + " , " + getFechaNacimiento() +  " ]";
    }
}
