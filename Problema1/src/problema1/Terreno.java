/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class Terreno {
    
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerCosto_Terreno() {
        costo_terreno = area*valorMetroCuadrado;
    }
    public void establecerAncho(double c){
        ancho = c;
    }
    public void establecerLargo(double c){
        largo = c;
    }
    public void establecerArea(){
        area = ancho*largo;
    }
     public void calcularValorMetroCuadrado(double c){
        valorMetroCuadrado = c ;
    }
    
    public double obtenerCosto_Terreno() {
        return costo_terreno;
    }
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerArea(){
        return area;
    }
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
}
