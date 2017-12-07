/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_claudiacortes;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Claudia Cortes
 */
public class Cajero implements Serializable{
    String Nombre;
    int Id;
    ArrayList<Orden> Ordenes=new ArrayList();
    JDialog Dialogo =new JDialog();
      JTable Tabla;
JTextField Texto=new JTextField();
public Ventana Ventana= new Ventana();
HiloTabla HT=new HiloTabla(true,true,Ventana.jt_Tablita,Ventana.jt_Procesando);
 private static final long SerialVersionUID=555555L;
    public Cajero(String Nombre, int Id) {
        this.Nombre = Nombre;
        this.Id = Id;
       Ventana.show(true);
    Ventana.lbl_NombreCajero.setText(Nombre);
    //HT.start();
    }
public void setOrden(Orden o){
    Ordenes.add(o);
}
    public HiloTabla getHT() {
        return HT;
    }

    public void setHT(HiloTabla HT) {
        this.HT = HT;
    }

    public Ventana getVentana() {
        return Ventana;
    }

    public void setVentana(Ventana Ventana) {
        this.Ventana = Ventana;
    }
public void  AgregarOrden (Orden O){
    Ordenes.add(O);
    HT.setOrden(O);
}
    public Cajero() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public ArrayList<Orden> getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(ArrayList<Orden> Ordenes) {
        this.Ordenes = Ordenes;
    }

    public JDialog getDialogo() {
        return Dialogo;
    }

    public void setDialogo(JDialog Dialogo) {
        this.Dialogo = Dialogo;
    }

    public JTable getTabla() {
        return Tabla;
    }

    public void setTabla(JTable Tabla) {
        this.Tabla = Tabla;
    }

    public JTextField getTexto() {
        return Texto;
    }

    public void setTexto(JTextField Texto) {
        this.Texto = Texto;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
