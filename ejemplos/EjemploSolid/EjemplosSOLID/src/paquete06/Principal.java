/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TarjetaCredito tc = new TarjetaCredito("Pepito", "0110105251541", 500.55);
        
        MayorEdad representante = new MayorEdad("José", tc);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s \n\nTarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().toString()
        );
        
    }
}
