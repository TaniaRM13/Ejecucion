/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecucion;

/**
 *
 * @author Tania
 */


public class Rodri implements Humano{
    public static final int TANIA = 1;
    public static final int JONA = 2;
    public static final int LUIS = 3;
    
    public void enseñar(){
        System.out.println("estoy enseñando!");
    }
    
    public static void golpear(int accion){
        String persona = "";
        switch(accion){
            case 1:
                persona = "Tania";
                break;
            case 2:
                persona = "Jona";
                break;
            case 3:
                persona = "Luis";
                break;
            default:
                break;
        }
        System.out.println("golpeo a "+persona);
    }

    @Override
    public void estudiar() {
        System.out.println("estoy estudiando");
    }
}
