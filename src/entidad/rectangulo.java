
package entidad;

import java.util.Scanner;

/**
 *
 * @author diabl
 */
public class rectangulo {
    private Scanner srt= new Scanner(System.in);
    private double b;
    private double h;
    private double aux; 
    public rectangulo() {
        
    }

    public rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public Scanner getSrt() {
        return srt;
    }

    public void setSrt(Scanner srt) {
        this.srt = srt;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }
    
    public void llenar(){
        System.out.println("Vamos a calcular los parametros de un rectangulo");
        System.out.println("Ingrese la base");
        this.setB(srt.nextDouble());
        System.out.println("Ingrese la altura");
        this.setH(srt.nextDouble());
    }
    public double Superficie(){
        return aux=(this.b*this.h);
    }
    public double Perimetro(){
        return aux=((this.b+this.h)*2);
    }
    public void pintar(){
          for (int i = 0; i < this.b; i++) {
            for (int j = 0; j < this.h; j++) {
                if(i==0 || i==this.b-1){
                    System.out.print("*");
                }else if(j==0 || j==this.h-1){
                    System.out.print("*");
                }else{
                
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
    }
}

