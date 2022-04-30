/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author SALA I
 */
public class Ejecutar {
    
    public static void main(String[] args) {
        // TODO code application logic here
        EquivalenteHora eq = new EquivalenteHora();
        
        int horas = 300;
        int minutos;
        int segundos;
        double dias;
        
        eq.establecerHoras(horas);
        eq.establecerDias();
        eq.establecerMinutos();
        eq.establecerSegundos();
        
        System.out.printf("Horas: %d h \nMinutos: %d m \nSegundos: %d s \nDias: %.2f\n", eq.obtenerHoras(),
                eq.obtenerMinutos(), eq.obtenerSegundos(), eq.obtenerDias());
    }
    
}
