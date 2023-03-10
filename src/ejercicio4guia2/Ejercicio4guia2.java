/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4guia2;

import entidad.rectangulo;

/**
 *
 * @author diabl
 */
public class Ejercicio4guia2 {


    public static void main(String[] args) {
       rectangulo rec= new rectangulo();
       rec.llenar();
        System.out.println("El perimetro es: "+rec.Perimetro());
        System.out.println("La superficie es: "+rec.Superficie());
       
        rec.pintar();
    }
    
}
