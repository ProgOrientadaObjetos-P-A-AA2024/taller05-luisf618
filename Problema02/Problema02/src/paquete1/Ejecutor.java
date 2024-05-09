/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author mabec
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String cedula;
        String marca;
        String cadena = "";
        int year;
        double valor;
        System.out.println("Ingrese la cantidad de automotores");
        opcion = entrada.nextInt();
        for (int i = 0; i < opcion; i++) {
            System.out.println("Ingrese la cedula del dueño:");
            entrada.nextLine();
            cedula = entrada.nextLine();
            System.out.println("Ingrese la marca del Vehiculo:");
            marca = entrada.nextLine();
            System.out.println("Ingrese el año de Fabricacion:");
            year = entrada.nextInt();
            System.out.println("Ingrese el valor de el Vehiculo");
            valor = entrada.nextDouble();
            Automotor automotor1 = new Automotor(cedula, marca, year, valor);
            automotor1.establecerValorMat();
            cadena = String.format("%s\n%s", cadena, automotor1);

        }
        System.out.println(cadena);
    }

}
