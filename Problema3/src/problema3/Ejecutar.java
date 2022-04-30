/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author SALA I
 */
public class Ejecutar {
    public static void main(String[] args) {
        // TODO code application logic here
        Institucion ins = new Institucion();
        
        String nombre;
        String tipoInstitucion;
        int numeroAlumnos = 300;
        int numeroDocentes = 40;
        int numeroSedes = 6;
        double gastosEstudiantes = 55;
        double presupuesto;
        
        ins.establecerNombre();
        ins.establecerTipoInstitucion();
        ins.establecerNumeroAlumnos(numeroAlumnos);
        ins.establecerNumeroDocentes(numeroDocentes);
        ins.establecerNumeroSedes(numeroSedes);
        ins.establecerGastosEstudiantes(gastosEstudiantes);
        ins.establecerPresupuesto();
        
        System.out.printf("Nombre de la institución: %s \nTipo de institucion: %s \nNúmero de alumnos: %d \nNúmero de docentes: %d"
                + "\nNúmero de sedes: %d \nGastos de los estudiantes: %.2f \nPresupuesto: %.2f\n", ins.obtenerNombre(), ins.obtenerTipoInstitucion(), ins.obtenerNumeroAlumnos(), 
                ins.obtenerNumeroDocentes(), ins.obtenerNumeroSedes(),ins.obtenerGastosEstudiantes(), ins.obtenerPresupuesto() );
    }
    
}
