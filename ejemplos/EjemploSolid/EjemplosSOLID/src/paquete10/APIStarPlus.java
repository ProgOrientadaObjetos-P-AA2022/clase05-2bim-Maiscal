/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class APIStarPlus implements APIMovie{
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"papoop32582po";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
