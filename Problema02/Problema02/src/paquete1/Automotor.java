/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author mabec
 */
public class Automotor {

    private String cedula;
    private String marca;
    private int year;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String c, String m, int y, double v) {
        cedula = c;
        marca = m;
        year = y;
        valorVehiculo = v;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerYear(int x) {
        year = x;
    }

    public void establecerValorVehiculo(double x) {
        valorVehiculo = x;
    }

    public void establecerValorMat() {
        valorMatricula = (valorVehiculo * (0.002 / 100)) * (2024 - year);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerYear() {
        return year;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula del dueño: %s\n"
                + "Marca de vehiculo: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor de Vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n", cedula, marca, year,
                valorVehiculo, valorMatricula);
        return cadena;
    }
}
