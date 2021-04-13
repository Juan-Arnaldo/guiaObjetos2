package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class factura {
    private String id;
    private double monto;
    private LocalDate fecha;
    private cliente cliente;

    public factura(String id, double monto, LocalDate fecha, cliente c){
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.cliente = c;
    }

    public String getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double montoFinal(double monto, double desc){
        double total, dif;
        dif = (desc / 100) * monto;
        total = monto - dif;
        return total;
    }

    //Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
    //email=?, descuento=?]]
    public void mostrarFactura(factura f, cliente c){
        System.out.println("\n\tFactura:\nid = " + f.getId() + "\nFecha = " + f.getFecha() + "\nMonto = " + f.getMonto() + "\nMonto con descuento = " + f.montoFinal(f.getMonto(), c.getDesc())
                            + "\n\tCliente:\nid = " + c.getId() + "\nNombre = " + c.getNombre() + "\nCorreo = " + c.getCorreo() + "\nDescuento = " + c.getDesc());
    }
}
