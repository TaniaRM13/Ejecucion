/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecucion;

/**
 *
 * @author Tania
 */
public class Perro extends Animal{
    
    public Perro(){
        
    }
    
    @Override
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("guau!");
    }
}
