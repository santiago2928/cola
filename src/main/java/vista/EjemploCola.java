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
        Cola<Personas> colaP = new Cola <>(); 
        
        colaP.encolar(new Personas("Santiago", "santiago.osorio_gra@uao"));
        colaP.encolar(new Personas("Kevin", "kevin_gra@uao"));
        colaP.encolar(new Personas("Daniel", "daniel_@uao"));
        
        
        System.out.println("Elementos en cola"+colaP.toString());
        
        for (int i = 0; i < 3; i++) {
            if(!colaP.estaVacia()){
                colaP.desencolar();
                System.out.println("Elementos en cola"+colaP.toString());
            }else{
                System.out.println("Cola Vacia");
            }
            
        }
        
    }
    
}
