/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author lcord
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double cal1;
        double cal2;
        double cal3;
        int opcion;
        
        System.out.println("¿Que desea realizar?\nPresione 1 para ingresar la"
                + " primera y segunda nota\nPresione 2 para ingresar las 3 "
                + "notas");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del estudiante");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingrese la nota 1");
                cal1 = entrada.nextDouble();
                System.out.println("Ingrese la nota 2");
                cal2 = entrada.nextDouble();
                Estudiante e1 = new Estudiante(nombre, cal1, cal2);
                e1.calcularCalificacion3();
                e1.CalcularPromedio();
                System.out.printf("%s\n", e1);
                break;
            case 2:
                System.out.println("Ingrese el nombre del estudiante");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Ingrese la nota 1");
                cal1 = entrada.nextDouble();
                System.out.println("Ingrese la nota 2");
                cal2 = entrada.nextDouble();
                System.out.println("Ingrese la nota 3");
                cal3 = entrada.nextDouble();
                Estudiante e2 = new Estudiante(nombre, cal1, cal2, cal3);
                e2.CalcularPromedio();
                System.out.printf("%s\n", e2);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        
    }
    
}
