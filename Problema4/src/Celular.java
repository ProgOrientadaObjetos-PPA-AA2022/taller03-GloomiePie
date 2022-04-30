/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Celular {
    
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String imei;
    
    public void establecerSistemaOperativo(){
        sistemaOperativo = "Windows";
    }
    public void establecerTamañoPantalla(double c) {
        tamañoPantalla = c;
    }
    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }
    public void establecerIvaPorcentaje(){
        ivaPorcentaje = 0.12; 
    }
    public void establecerIvaCostoInicial(){
        ivaCostoInicial = ivaPorcentaje*costoInicial;
    }
    public void establecerCostoFinal(){
        costoFinal = ivaCostoInicial + costoInicial;
    }
    public void establecerDireccionMac(String c){
        direccionMac = c;
    }
    public void establecerImei(String c){
        imei = c;
    }
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    public double obtenerTamañoPantalla(){
        return tamañoPantalla;
    }
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    public double obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public String obtenerImei(){
        return imei;
    }
    
}
