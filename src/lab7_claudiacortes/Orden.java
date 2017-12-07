/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_claudiacortes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Orden implements Serializable{
    Cliente comprador;
    ArrayList<Productos> Ordenes=new ArrayList();
    Cajero Vendedor;
 private static final long SerialVersionUID=6666666L;
    public Orden() {
    }

    public Orden(Cliente comprador, Cajero Vendedor) {
        this.comprador = comprador;
        this.Vendedor = Vendedor;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public ArrayList<Productos> getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(ArrayList<Productos> Ordenes) {
        this.Ordenes = Ordenes;
    }

    public Cajero getVendedor() {
        return Vendedor;
    }

    public void setVendedor(Cajero Vendedor) {
        this.Vendedor = Vendedor;
    }

    @Override
    public String toString() {
        return "Orden{" + "comprador=" + comprador + ", Ordenes=" + Ordenes + ", Vendedor=" + Vendedor + '}';
    }
    
    
}
