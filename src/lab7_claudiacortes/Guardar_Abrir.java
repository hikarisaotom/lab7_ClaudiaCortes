/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_claudiacortes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudia Cortes
 */
public class Guardar_Abrir {

    ArrayList<Cliente> C = new ArrayList();
    ArrayList<Cajero> Ca = new ArrayList();
    ArrayList<Orden> O = new ArrayList();
        ArrayList<Productos> P = new ArrayList();
    File archivo;
    File archivo1;
    File archivo2;
        File archivo3;

    public Guardar_Abrir() {
        archivo = new File(".//Clientes.clau");
        archivo1 = new File(".//Cajero.clau2");
        archivo2 = new File(".//Ordenes.clau");
           archivo3 = new File(".//Ordenes.clau");
    }

    public ArrayList<Productos> getP() {
        return P;
    }

    public void setP(ArrayList<Productos> P) {
        this.P = P;
    }

    public File getArchivo3() {
        return archivo3;
    }

    public void setArchivo3(File archivo3) {
        this.archivo3 = archivo3;
    }

    public ArrayList<Cliente> getC() {
        return C;
    }

    public void setC(ArrayList<Cliente> C) {
        this.C = C;
    }

    public ArrayList<Cajero> getCa() {
        return Ca;
    }

    public void setCa(ArrayList<Cajero> Ca) {
        this.Ca = Ca;
    }

    public ArrayList<Orden> getO() {
        return O;
    }

    public void setO(ArrayList<Orden> O) {
        this.O = O;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo1() {
        return archivo1;
    }

    public void setArchivo1(File archivo1) {
        this.archivo1 = archivo1;
    }

    public File getArchivo2() {
        return archivo2;
    }

    public void setArchivo2(File archivo2) {
        this.archivo2 = archivo2;
    }

    public Guardar_Abrir(File archivo, File archivo1, File archivo2, File archivo3) {
        this.archivo = archivo;
        this.archivo1 = archivo1;
        this.archivo2 = archivo2;
        this.archivo3 = archivo3;
    }

    public void EscribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo3);
            bw = new ObjectOutputStream(fw);
            for (Productos persona : P) {
                bw.writeObject(persona);
            }
            
            bw.flush();

//            fw = new FileOutputStream(archivo1);
//            bw = new ObjectOutputStream(fw);
//            for (Cajero persona : Ca) {
//                bw.writeObject(persona);
//            }
//            bw.flush();

//            fw = new FileOutputStream(archivo2);
//            bw = new ObjectOutputStream(fw);
//            for (Orden persona : O) {
//                bw.writeObject(persona);
//            }
//            bw.flush();
            JOptionPane.showMessageDialog(null, "GUARDADO");
        } catch (Exception ex) {

        }

        bw.close();

        fw.close();
    }

    public void CargarArchivo() {
             try{
           P=new ArrayList();
          Productos temp;
            if (archivo3.exists()) {
                FileInputStream entrada=new FileInputStream(archivo3);
                ObjectInputStream objeto =new ObjectInputStream(entrada);
                try{
                    while((temp=(Productos)objeto.readObject())!=null){
                        P.add(temp);
                    }
                }catch(EOFException e){
                    //SIEMPRE VA A TIRAR ERROR
                    //Encontro el final del archivo.
                }
                 objeto.close();//cierre del buffer
                 entrada.close();//cierre del canal , se abren inversamete a como se abren 
                 
            }//fin del if
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    }

