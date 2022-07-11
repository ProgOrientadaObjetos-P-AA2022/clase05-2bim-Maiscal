/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.Serializable;

/**
 *
 * @author SALA I
 */
public class APIDirectvGo implements APIMovie, Serializable{
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = String.format(ak+"3a2sd165a");
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
