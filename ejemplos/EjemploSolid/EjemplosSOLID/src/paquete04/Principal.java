/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTranvia tt = new TransporteTranvia();
        taxi.establecerCooperativaTaxi("Loja");
        taxi.establecerTarifa();
        
        
        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> tl = new ArrayList<>();
        tl.add(bus);
        tl.add(taxi);
        tl.add(tt);
        tipos.establecerTransportes(tl);
        tipos.establecerPromedioTarifas();
       
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
