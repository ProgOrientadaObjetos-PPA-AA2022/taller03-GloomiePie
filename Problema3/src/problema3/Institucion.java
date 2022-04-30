/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author SALA I
 */
public class Institucion {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiantes;
    private double presupuesto;
    
    public void establecerNombre() {
        nombre = "Ateneo";
    }
    public void establecerTipoInstitucion(){
        tipoInstitucion = "Privada";
    }
    public void establecerNumeroAlumnos(int c){
        numeroAlumnos = c;
    }
    public void establecerNumeroDocentes(int c){
         numeroDocentes = c;
    }
     public void establecerNumeroSedes(int c){
        numeroSedes = c ;
    }
     public void establecerGastosEstudiantes(double c) {
         gastosEstudiantes = c;
     }
     public void establecerPresupuesto() {
         presupuesto = numeroAlumnos*gastosEstudiantes;
     }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    public double obtenerGastosEstudiantes() {
        return gastosEstudiantes;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
