/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author lcord
 */
public class Estudiante {
    private String nombreEstudiantes;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String n, double c1, double c2) {
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
    }
    
    public Estudiante(String n, double c1, double c2, double c3) {
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public void establecerNombreEstudiantes(String x) {
        nombreEstudiantes = x;
    }

    public void establecerCalificacion1(double x) {
        calificacion1 = x;
    }

    public void establecerCalificacion2(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacion3(double x) {
        calificacion3 = x;
    }
    
    public void calcularCalificacion3() {
        calificacion3 = (calificacion1 + calificacion2) / 2;
    }

    public void CalcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
    }

    public String obtenerNombreEstudiantes() {
        return nombreEstudiantes;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Libreta de Calificaciones\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f", 
                nombreEstudiantes,
                calificacion1, 
                calificacion2, 
                calificacion3,
                promedio);
        return cadena;
    }
    
}
