/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class Principal2 {
    public static void main(String[] args) {
        String nomAr = "Guardados.data";
        
        EscrituraAr archivo = new EscrituraAr(nomAr);
        APINetflix api = new APINetflix();
        api.establecerApiKey("N123455");
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        archivo.setRegistro(gp);
        archivo.setSalida();
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("A123455");
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        archivo.setRegistro(gp2);
        archivo.setSalida();
         
        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("DIGO482154as");
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        archivo.setRegistro(gp3);
        archivo.setSalida();
        
        APIStarPlus api4 = new APIStarPlus();
        api4.establecerApiKey("SPLUS8A1D8254");
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        archivo.setRegistro(gp4);
        archivo.setSalida();
        
    }
}
