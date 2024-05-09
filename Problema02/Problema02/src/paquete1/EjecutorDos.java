/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author mabec
 */
public class EjecutorDos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean opcion = true;
        int num;
        String cedula;
        String marca;
        String cadena = "";
        int year;
        double valor;
        while (opcion) {
            System.out.println("Ingrese la cedula del dueño:");
            cedula = entrada.nextLine();
            System.out.println("Ingrese la marca del Vehiculo:");
            marca = entrada.nextLine();
            System.out.println("Ingrese el año de Fabricacion:");
            year = entrada.nextInt();
            System.out.println("Ingrese el valor de el Vehiculo");
            valor = entrada.nextDouble();
            entrada.nextLine();
            Automotor automotor1 = new Automotor(cedula, marca, year, valor);
            automotor1.establecerValorMat();
            cadena = String.format("%s\n%s", cadena, automotor1);
            System.out.println("Ingrese [1] para no ingresar otro automotor");
            num = entrada.nextInt();
            if (num == 1) {
                opcion = false;
            }

        }
        System.out.println(cadena);
    }
}
