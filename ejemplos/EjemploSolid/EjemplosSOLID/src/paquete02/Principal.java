/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Persona> listaP = new ArrayList<>();
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        
        Persona p1 = new Persona("Mario", 21);
        Persona p2 = new Persona("Luis", 18);
        Persona p3 = new Persona("Jaime", 20);
        Persona p4 = new Persona("Lucia", 22);
        
        listaP.add(p1);
        listaP.add(p2);
        listaP.add(p3);
        listaP.add(p4);
        
        op.establecerEstudiante(listaP);
        op.establecerPromedioEdades();
        
        System.out.printf("%s\n",op);
        
    }
}
