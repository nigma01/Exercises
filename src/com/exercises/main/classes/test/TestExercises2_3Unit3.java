package com.exercises.main.classes.test;

import com.exercises.auxiliar.classes.Articulo;
import com.exercises.auxiliar.classes.Book;
import com.exercises.auxiliar.classes.Dvd;

/**
 * Created by David on 02/05/2015.
 */
public class TestExercises2_3Unit3 {

    public static void main(String... args){

        Articulo articulo = new Articulo();

        articulo.setNombre("Articulo1");
        articulo.setPrecio(125.56);
        articulo.setReferencia("2345B");

        System.out.println(articulo.toString());

        Book book = new Book();

        book.setNombre("Libro1");
        book.setPrecio(125.56);
        book.setReferencia("2345B");
        book.setAutor("Autor1");
        book.setIsbn("256478nm2544");
        book.setPaginas(125);

        System.out.println(book.toString());


        Dvd dvd = new Dvd();

        dvd.setNombre("Dvd1");
        dvd.setPrecio(125.56);
        dvd.setReferencia("2346");
        dvd.setRealizador("Realizador 1");
        dvd.setDuracion("1h 30m");

        System.out.println(dvd.toString());
    }
}
