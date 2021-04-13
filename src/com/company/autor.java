package com.company;

public class autor {
    private String nombre;
    private String apellido;
    private String gmail;
    private String sexo;

    public autor (String nombre, String apellido, String gmail, String sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.gmail = gmail;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void mostrarAutor(autor a){
        System.out.println("\tautor " + "\nNombre Completo: " + a.getNombre() + " " + a.getApellido() + "\ngmail: " + a.getGmail() + "\nSexo: " + a.getSexo());
    }
}
