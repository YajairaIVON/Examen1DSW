/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.empresabotanical.controlador;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.empresabotanical.modelo.entidades.Lechuga;
import udem.edu.co.empresabotanical.modelo.entidades.Mora;
import udem.edu.co.empresabotanical.modelo.entidades.Zanahoria;
import udem.edu.co.empresabotanical.modelo.interfaz.Especiesplantas;

/**
 *
 * @author b12s309
 */
public class Controlador {
   
        
    public String imprimir(){
    
        List<Especiesplantas> especiesplantas= new ArrayList<>();
    
        especiesplantas.add(new Lechuga("Lechuga romana", "Verde", 1));
        especiesplantas.add(new Mora("Mora azul", "azul", 6));
        especiesplantas.add(new Zanahoria("Zanahoria pequeña", "Naranja", 3));
    
        especiesplantas.toString();
        return null;
    
    
    }
}
