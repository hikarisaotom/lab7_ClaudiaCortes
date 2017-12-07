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
public class Cliente implements Serializable{
    String Nombre;
    int edad;
    Orden orden;
    private static final long SerialVersionUID=240214L;
    public Cliente() {
    }

    public Cliente(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public Cliente(String Nombre, int edad, Orden orden) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.orden = orden;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", edad=" + edad + ", orden=" + orden + '}';
    }
    
}
