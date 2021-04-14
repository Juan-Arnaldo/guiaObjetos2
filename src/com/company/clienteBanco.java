package com.company;

public class clienteBanco {
    private int id;
    private String nombre;
    private String sexo;
    private int deudor;

    public clienteBanco(int id, String nombre, String sexo){
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.deudor = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setDeudor(clienteBanco c){
        if(c.deudor == 1){
            this.deudor = 0;
        }else{
            this.deudor = 1;
        }
    }

    public int getDeudor(){
        return  deudor;
    }

    public void mostrarCliente(clienteBanco c, cuenta cuenta){
        if(c.getDeudor() == 1){
            System.out.println("Nombre: " + c.getNombre() + "\nSexo: " + c.getSexo() + "\nDeuda: " + cuenta.getBalance() + "\n");
        }else{
            System.out.println("Nombre: " + c.getNombre() + "\nSexo: " + c.getSexo() + "\nBalance: " + cuenta.getBalance() + "\n");
        }

    }
}
