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

    public void setAutor() {
        this.autor = autor;
    }

    public void mostrarLibro(libro l){
        System.out.println("Titulo: " + l.getTitulo() + ", precio: $" + l.getPrecio() + ", stock: " + l.getStock());
    }

    public void mostrarlibro2(libro l, autor a){
        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        System.out.println("El libro: " + l.getTitulo() + " de " + a.getNombre() + ", se vende a " + l.getPrecio() + " pesos");
    }

    public libro cambiarPrecio(libro l, int nuevoPrecio){
        l.precio = nuevoPrecio;
        return l;
    }

    public  libro cambiarStock(libro l, int aumetoStock){
        l.stock += aumetoStock;
        return l;
    }
}
