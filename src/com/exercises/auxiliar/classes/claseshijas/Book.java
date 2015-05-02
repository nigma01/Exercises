package com.exercises.auxiliar.classes.claseshijas;

import com.exercises.auxiliar.classes.Articulo;


public class Book extends Articulo {

    private Autor autor;
    private String isbn;
    private Integer paginas;


    public Book() {

    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }


    @Override
    public String toString() {
        return super.toString() + "[ " + getAutor() + " , " + getIsbn() + " , " + getPaginas() + " ]";
    }
}
