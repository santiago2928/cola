/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import cola.Cola;
import modelo.Personas;

/**
 *
 * @author santiago.osorio_gra
 */
public class EjemploCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola<Personas> cola = new Cola <>(); 
        cola.encolar(new Personas("Santiago", "santiago.osorio_gra@uao"));
        cola.encolar(new Personas("Kevin", "kevin_gra@uao"));
        cola.encolar(new Personas("Daniel", "daniel_@uao"));
        
    }
    
}
