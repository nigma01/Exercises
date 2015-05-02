package com.exercises.auxiliar.classes;

/**
 * Created by David on 02/05/2015.
 */
public class Book extends Articulo {

    private String autor;
    private String isbn;
    private Integer paginas;


    public Book() {

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
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
        return super.toString() + "[ " + autor + " , " + isbn + " , " + paginas + " ]";
    }
}
