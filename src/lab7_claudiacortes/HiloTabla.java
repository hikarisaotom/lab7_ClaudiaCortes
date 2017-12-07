/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_claudiacortes;

import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Claudia Cortes
 */
public class HiloTabla extends Thread{
    int Tiempo=1;
     private boolean avanzar;
    private boolean vive;
    JTable Tabla;
Orden Orden;
JTextField Texto;

    public HiloTabla(boolean avanzar, boolean vive, JTable Tabla,JTextField Texto) {
        this.avanzar = avanzar;
        this.vive = vive;
        this.Tabla = Tabla;
        this.Texto=Texto;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JTable getTabla() {
        return Tabla;
    }

    public void setTabla(JTable Tabla) {
        this.Tabla = Tabla;
    }

    public Orden getOrden() {
        return Orden;
    }

    public void setOrden(Orden Orden) {
        this.Orden = Orden;
    }
    
    @Override
    public void run() {
        while (true) {
            if (avanzar) {
                if (Orden.getOrdenes().size() > 0) {
                    for (int i = 0; i < Orden.getOrdenes().size(); i++) {
                        Texto.setText(Orden.getOrdenes().get(i).getNombre());
                        try {
                            Thread.sleep(Tiempo*1000);//PONERLE SIEMPRE EL SLEEP por si si sucede cualquier cambio que sea necesario.
                            Object[] newrow = {Orden.getOrdenes().get(i), Orden.getComprador(), Orden.getOrdenes().get(i).getTiempo_Procesamiento()
                            };
                            DefaultTableModel Modelo = (DefaultTableModel) Tabla.getModel();
                            Modelo.addRow(newrow);
                            Tabla.setModel(Modelo);
                              this.Tiempo = Orden.getOrdenes().get(i).getTiempo_Procesamiento();
                            
                        } catch (InterruptedException ex) {

                        }
                       
                    }
                     avanzar=false;
                }else{
                    System.out.println("NO HAY PRODUCTOS");
                }
            }
            try {
                Thread.sleep(50000);//PONERLE SIEMPRE EL SLEEP por si si sucede cualquier cambio que sea necesario.
            } catch (InterruptedException ex) {
            }
        }

    }
}
