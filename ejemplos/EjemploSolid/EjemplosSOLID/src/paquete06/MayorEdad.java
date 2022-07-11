/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;



/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona{
    //private String tarjeta;
    private TarjetaCredito tarjeta; // nombre, codigo, cupoMax
    
    public MayorEdad(String n, TarjetaCredito tar){
        super(n);
        tarjeta = tar;
    }
    public void establecerTarjeta(TarjetaCredito n){
        tarjeta = n;
    }
    
    public TarjetaCredito obtenerTarjeta(){
        return tarjeta;
    }

    @Override
    public String toString() {
        
        String c = String.format("Nombre: %s\n"
                + "Codigo: %s\n"
                + "Cupo maximo: %.2f\n"
                ,obtenerTarjeta().obtenerNombre()
                ,obtenerTarjeta().obtenerCodigo()
                ,obtenerTarjeta().obtenerCupoMax()
        );
        
        return c;
    }
    
}
