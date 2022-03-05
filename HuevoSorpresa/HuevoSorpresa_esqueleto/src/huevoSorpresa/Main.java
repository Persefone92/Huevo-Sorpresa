/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huevoSorpresa;
/**
* Clase main del programa, que define un objeto huevoSorpresa con unos parámetros 
y realiza
* acciones de aumentar el precio de venta de un huevo sorpresa y sacar un número de huevos sorpresa. 
* 
 * @author LauraRosaGarcia
 */
public class Main {

    /**
     * Método main
     * 
     * Este método crea un nuevo objeto HuevoSorpresa
     * @param args
     */
    public static void main(String[] args) {
        HuevoSorpresaRosaGarciaLaura2122 h_sorpresa;
        h_sorpresa=new HuevoSorpresaRosaGarciaLaura2122(10,5,"peluche",10);
        opera_PrecioRosaGarciaLaura2122(h_sorpresa);
        
        opera_UnidadesRosaGarciaLaura2122(h_sorpresa);
        
    }
    
    /**
     * Método opera_UnidadesRosaGarciaLaura2122.
     * 
     * En este método se intentará sacar dos huevos sorpresa
     * como la idea es que no hay dinero va a saltar la excepción 
     * y no se modificará el número de unidades de la tienda
     * 
     * @param h_sorpresa objeto HuevoSorpresa que se quiere sacar
     * @throws exception si no se tiene dinero suficiente para pagar los huevos sorpresa
     * o no hay suficientes unidadaes en tienda.
     * 
     */

    private static void opera_UnidadesRosaGarciaLaura2122(HuevoSorpresaRosaGarciaLaura2122 h_sorpresa) {
        /*Vamos a intentar sacar 2 huevos sorpresa, como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("Vamos a sacar huevos sorpresa");
            h_sorpresa.sacarHuevosSorpresas(2, 4, "llavero");
            System.out.println("Operación realizada, ahora tiene "+h_sorpresa.obtenerUnidades()+" unidades en la tienda");
        } catch (Exception e) {
            System.out.println("Error al sacar huevos sorpresa, el nº de unidades sigue siendo: "+h_sorpresa.obtenerUnidades());
            
        }
    }
    
    /**
     * Método opera_PrecioRosaGarciaLaura2122
     * 
     * En este método se va a intentar subir el precio tres euros
     * 
     * Como el máximo de precio está en diez euros, la operación tendra éxito y pasará a valer ocho euros.
     * 
     * @param h_sorpresa objeto HuevoSorpresa que va a aumentar de precio
     * @throws exception si la cantidad  a aumentar  supera el precio máximo
     */

    private static void opera_PrecioRosaGarciaLaura2122(HuevoSorpresaRosaGarciaLaura2122 h_sorpresa) {
        /*Vamos a aumentar el precio 3€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 8€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un huevo sorpresa");
            h_sorpresa.aumentarPrecio(3);
            System.out.println("El precio actual es "+h_sorpresa.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }
    
    
}
