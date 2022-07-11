/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
class TarjetaCredito {
    
    private String nombre;
    private String codigo;
    private double cupoMax;

    public TarjetaCredito(String n, String co, double c) {
        nombre = n;
        codigo = co;
        cupoMax = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }
    public void establecerCodigo(String c) {
        codigo = c;
    }
    public void establecerCupoMax(double c) {
        cupoMax = c;
    }

    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerCodigo() {
        return codigo;
    }
    public double obtenerCupoMax() {
        return cupoMax;
    }
    
    @Override
    public String toString() {
        
        String c = String.format("Nombre: %s\n"
                + "Codigo: %s\n"
                + "Cupo maximo: %.2f\n"
                ,obtenerNombre()
                ,obtenerCodigo()
                ,obtenerCupoMax()
        );
        
        return c;
    }
}
