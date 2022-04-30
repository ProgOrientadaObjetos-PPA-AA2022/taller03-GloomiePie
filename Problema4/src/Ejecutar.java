/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejecutar {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Celular cel = new Celular();
        
        String sistemaOperativo;
        double tamañoPantalla = 0.30;
        double costoInicial = 350;
        double ivaPorcentaje;
        double ivaCostoInicial;
        double costoFinal;
        String direccionMac = "00:1e:c2:9e:28:6b";
        String imei = "010928/00/389023/3";
        
        cel.establecerSistemaOperativo();
        cel.establecerTamañoPantalla(tamañoPantalla);
        cel.establecerCostoInicial(costoInicial);
        cel.establecerIvaPorcentaje();
        cel.establecerIvaCostoInicial();
        cel.establecerCostoFinal();
        cel.establecerDireccionMac(direccionMac);
        cel.establecerImei(imei);
        
        System.out.printf("Sistema operativo: %s \nTamaño de la pantalla: %.2f \nCosto inicial: %.2f \nIva: %.2f \nIva en el costo inicial %.2f"
                + "\nCosto final: %.2f \nDirección Mac: %s \nIMEI: %s \n",cel.obtenerSistemaOperativo(), cel.obtenerTamañoPantalla(), cel.obtenerCostoInicial(),
                cel.obtenerIvaPorcentaje(), cel.obtenerIvaCostoInicial(), cel.obtenerCostoFinal(), cel.obtenerDireccionMac(), cel.obtenerImei());
        
    }
    
}
