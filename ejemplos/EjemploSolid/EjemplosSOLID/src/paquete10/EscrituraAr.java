/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class EscrituraAr {
    private String nom;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> listaG;

    public EscrituraAr(String n) {
    nom = n;
    setListaG();
        try {
            salida = new ObjectOutputStream(new FileOutputStream(nom));
            if(getListaG().size() > 0){
                for(int i = 0; i <getListaG().size(); i++){
                    setRegistro(getListaG().get(i));
                    setSalida();
                }
            }
        } catch (IOException iOException) {
            System.out.println("Erro al abrir el archivo.");
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setRegistro(GeneradorPeliculas registro) {
        this.registro = registro;
    }
    public void setSalida(){
        try {
            salida.writeObject(registro); 
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void setListaG() {
        LecturaAr l = new LecturaAr(getNom());
        l.establecerLista();
        listaG = l.obtenerLista();
    }

    public String getNom() {
        return nom;
    }
    public ObjectOutputStream getSalida() {
        return salida;
    }
    public GeneradorPeliculas getRegistro() {
        return registro;
    }
    public ArrayList<GeneradorPeliculas> getListaG() {
        return listaG;
    }
    
    public void cerrarArchivo() {
        try{
            if (salida != null) {
                salida.close();
            }
        }catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");   
        }
    } 
    
}
