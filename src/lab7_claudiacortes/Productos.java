/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_claudiacortes;

import java.io.Serializable;

/**
 *
 * @author Claudia Cortes
 */
public class Productos implements Serializable{
    String Nombre;
    double precio;
    int Tiempo_Procesamiento;
 private static final long SerialVersionUID=89255L;
    public Productos() {
    }

    public Productos(String Nombre, double precio, int Tiempo_Procesamiento) {
        this.Nombre = Nombre;
        this.precio = precio;
        this.Tiempo_Procesamiento = Tiempo_Procesamiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempo_Procesamiento() {
        return Tiempo_Procesamiento;
    }

    public void setTiempo_Procesamiento(int Tiempo_Procesamiento) {
        this.Tiempo_Procesamiento = Tiempo_Procesamiento;
    }

    @Override
    public String toString() {
        return Nombre ;
    }
    
}
