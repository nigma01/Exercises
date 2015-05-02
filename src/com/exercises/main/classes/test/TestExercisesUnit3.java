package com.exercises.main.classes.test;

import com.exercises.auxiliar.classes.Articulo;
import com.exercises.auxiliar.classes.claseshijas.Autor;
import com.exercises.auxiliar.classes.claseshijas.Book;
import com.exercises.auxiliar.classes.claseshijas.Dvd;
import com.exercises.auxiliar.classes.claseshijas.Realizador;

import java.util.Date;

/**
 * Created by David on 02/05/2015.
 */
public class TestExercisesUnit3 {

    public static void main(String... args){

        Articulo articulo = new Articulo();

        articulo.setNombre("Articulo1");
        articulo.setPrecio(125.56);
        articulo.setReferencia("2345B");
        printDatos(articulo);


        Book book = new Book();

        book.setNombre("Libro1");
        book.setPrecio(125.56);
        book.setReferencia("2345B");
        Autor autor = new Autor("Autor1", "Apellidos1", new Date());
        book.setAutor(autor);
        book.setIsbn("256478nm2544");
        book.setPaginas(125);
        printDatos(book);



        Dvd dvd = new Dvd();

        dvd.setNombre("Dvd1");
        dvd.setPrecio(125.56);
        dvd.setReferencia("2346");
        Realizador realizador = new Realizador("Realizador1", "Apellidos1", new Date());
        dvd.setRealizador(realizador);
        dvd.setDuracion("1h 30m");
        printDatos(dvd);

    }

    private static  void printDatos(Articulo a){
        System.out.println(a.toString());
    }
}
