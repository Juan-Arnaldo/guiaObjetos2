package com.company;

public class cuenta {
    private int id;
    private double balance;
    private clienteBanco cliente;

    public cuenta(int id, double balance, clienteBanco c){
        this.id = id;
        this.balance = balance;
        this.cliente = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public clienteBanco getCliente() {
        return cliente;
    }

    public void setCliente(clienteBanco cliente) {
        this.cliente = cliente;
    }

    public double depositar(cuenta c, double aDepositar){
        return c.balance += aDepositar;
    }

    public double extraer(cuenta c, double aExtraer){
        return c.balance - aExtraer;
    }

    public void mostrarBalance(cuenta c, clienteBanco cliente){
        System.out.println("Cliente: " + cliente.getNombre() + "\nBalance: " + c.getBalance() + "\n");
    }
}
