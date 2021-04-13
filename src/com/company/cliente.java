package com.company;

public class cliente {

    private String id;
    private String nombre;
    private String correo;
    private double desc;

    public cliente(String id, String nombre, String correo, double desc){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public double getDesc() {
        return desc;
    }

    public void mostrarCliente(cliente c){
        System.out.println("ID:" + c.getId() + "\nNombre:" + c.getNombre() + "\nCorreo:" + c.getCorreo() + "\nDesc:" + c.getDesc());
    }
}
