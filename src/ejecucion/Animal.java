/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecucion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tania
 */
public class Animal {
    String color;
    String tamaño;
    int numPatas;
    
    public Animal(){
        System.out.println("constructor vacio");
    }
    public Animal(String color, String tamaño, int numPatas){
        this.color = color;
        this.numPatas = numPatas;
        this.tamaño = tamaño;
        
        String concatenado = "color: "+color+", tamaño: "+tamaño+", # patas: "+numPatas;
        /*String numero = numPatas + "";
        String numero2 = String.valueOf(numPatas);
        int numerito = Integer.valueOf(numero);*/
        System.out.println(concatenado);
        
    }
    public void hacerSonido(){
        System.out.println("Sonidito");
    }
    public void comer(){
        System.out.println("estoy comiendo");
    }
}
