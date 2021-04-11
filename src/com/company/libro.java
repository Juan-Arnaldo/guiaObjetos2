package com.company;

public class libro {
    private String titulo;
    private int precio;
    private int stock;
    private autor autor;

    public libro (String titulo, int precio, int stock, autor autor){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public com.company.autor getAutor() {
        return autor;
    }

    public void setAutor(com.company.autor autor) {
        this.autor = autor;
    }


}
