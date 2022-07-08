/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }

    @Override
    public String toString() {
        String c = "";
        for(int i = 0; i < obtenerEstudiante().size();i++){
            c = String.format("%s\nNombre: %s\nEdades: %d\n"
                    ,c
                    ,obtenerEstudiante().get(i).obtenerNombre()
                    ,obtenerEstudiante().get(i).obtenerEdad()
            );
        }
        
        c = String.format("Lista de estudiantes...\n%s\n"
                + "Promedio de edades: %.2f\n"
                ,c
                ,obtenerPromedioEdades()
        );
        return c;
    }
}
