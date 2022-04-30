/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    
    
    public static void main(String[] args) {
        Terreno ct = new Terreno();
        
        double costo_terreno;
        double ancho = 200;
        double largo = 200;
        double valorMetroCuadrado = 100;
        double area;
        
        ct.establecerAncho(ancho);
        ct.establecerLargo(largo);
        ct.calcularValorMetroCuadrado(valorMetroCuadrado);
        ct.establecerArea();
        ct.establecerCosto_Terreno();
        
        System.out.printf("El costo del terreno es: %.2f \n Ancho del terreno: %.2f \n Largo del terreno: %.2f \n", ct.obtenerCosto_Terreno(), ct.obtenerAncho(), ct.obtenerLargo() );
        
    }
}
