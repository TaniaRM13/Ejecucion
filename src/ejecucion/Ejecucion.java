/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecucion;

/**
 *
 * @author Tania
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejemploRodri();
        Thread hilito = new Thread(new Runnable() {
            @Override
            public void run() {
                
            }
        });
        hilito.start();
        Rodri.golpear(Rodri.LUIS);
        
    }
    
    
    public static void ejemploRodri(){
        Object [] objetos = {new Animal(), new Rodri()};
        for (Object objeto : objetos){
            String nombre = objeto.getClass().getSimpleName();
            //System.out.println(nombre);
            if (nombre.equals("Animal")){
                ((Animal)objeto).hacerSonido();
            }else if(nombre.equals("Rodri")){
                ((Rodri)objeto).enseñar();
            }
        }
    }
     
    public void ejemploAnimales(){
        Animal animalito = new Animal("rojo","grande",5);
        Perro perrito = new Perro();
        //perrito.hacerSonido();
        Gato gatito = new Gato();
        //gatito.hacerSonido();
        
        Animal animalote = new Perro();
        /*animalote.hacerSonido();
        animalote.comer();*/
        
        Animal [] animales = {perrito, gatito, animalote}; 
        for (Animal animale : animales) {
            animale.hacerSonido();
        }
    }
    
}
