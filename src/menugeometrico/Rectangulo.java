/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menugeometrico;
import java.util.*;
/**
 * @author David Castro-Paola Joya
 */

public class Rectangulo extends Figura{
      double cordenadaX3,cordenadaY3,cordenadaX4,cordenadaY4,lado1,lado2,lado3,lado4;

    public Rectangulo(double cordenadaX3, double cordenadaY3, double cordenadaX4, double cordenadaY4, double cordenadaX, double cordenadaX2, double cordenadaY, double cordenadaY2) {
        super(cordenadaX, cordenadaX2, cordenadaY, cordenadaY2);
        this.cordenadaX3 = cordenadaX3;
        this.cordenadaY3 = cordenadaY3;
        this.cordenadaX4 = cordenadaX4;
        this.cordenadaY4 = cordenadaY4;
    }

    public double getCordenadaX3() {
        return cordenadaX3;
    }

    public void setCordenadaX3(double cordenadaX3) {
        this.cordenadaX3 = cordenadaX3;
    }

    public double getCordenadaY3() {
        return cordenadaY3;
    }

    public void setCordenadaY3(double cordenadaY3) {
        this.cordenadaY3 = cordenadaY3;
    }

    public double getCordenadaX4() {
        return cordenadaX4;
    }

    public void setCordenadaX4(double cordenadaX4) {
        this.cordenadaX4 = cordenadaX4;
    }

    public double getCordenadaY4() {
        return cordenadaY4;
    }

    public void setCordenadaY4(double cordenadaY4) {
        this.cordenadaY4 = cordenadaY4;
    }
    
    public int ladoIgual(){
         double distanciax,distanciay,distanciax2,distanciax3,distanciax4,distanciay2,distanciay3,distanciay4;
         int auxiliar=0;
         distanciax=super.distanciaDeX(cordenadaX, cordenadaX2);
         distanciay=super.distanciaDeY(cordenadaY, cordenadaY2);
         this.lado1=super.magnitudLado(distanciax, distanciay); 
         distanciax2=super.distanciaDeX(cordenadaX2, cordenadaX3);
         distanciay2=super.distanciaDeY(cordenadaY2, cordenadaY3);
         this.lado2=super.magnitudLado(distanciax2, distanciay2);
         distanciax3=super.distanciaDeX(cordenadaX3, cordenadaX4);
         distanciay3=super.distanciaDeY(cordenadaY3, cordenadaY4);
         this.lado3=super.magnitudLado(distanciax3, distanciay3);
         distanciax4=super.distanciaDeX(cordenadaX, cordenadaX4);
         distanciay4=super.distanciaDeY(cordenadaY, cordenadaY4);
         this.lado4=super.magnitudLado(distanciax4, distanciay4);
         if(lado1==lado2 && lado2!=lado3 && lado2!=lado4){
              auxiliar=1; 
             }else if(lado1==lado3 && lado3!=lado2 && lado4!=lado4){
                auxiliar=2;
             }else if(lado1==lado4 && lado4!=lado2 && lado4!=lado3){
                    auxiliar=3;
     }return auxiliar;
    }
    
      @Override
    public double area(){
     double area=0.0;
     if(ladoIgual()==1){
       area=lado1*lado3;  
     }else if(ladoIgual()==2){
         area=lado1*lado2;
     }else if(ladoIgual()==3){
         area=lado1*lado2;
     }return area;
    }
      @Override
    public double perimetro(){
       return (lado1+lado2+lado3+lado4);
    }
    private boolean validacion(){
       boolean val=false;
       if((lado1==lado2 && lado2!=lado3 && lado2!=lado4)||(lado1==lado3 && lado3!=lado2 && lado4!=lado4)||(lado1==lado4 && lado4!=lado2 && lado4!=lado3)){
           val=true;
         }return val;   
    }
    private boolean validacionLados(){
        return (lado1==lado2 && lado2==lado3 && lado3==lado4);
    }
      @Override
    public void imprimir(){
        super.imprimir();
        if(validacionLados()==false){
            if(validacion()==true){
                System.out.println("El area es :"+area());
                System.out.println("El perimetro es :"+perimetro());
                System.out.println("Lado1 , Lado2 , Lado3, Lado4 :"+lado1+lado2+lado3+lado4);
            }else
                System.out.println("No existe");
        }else
              System.out.println("Es un cuadrado no es un rectangulo");
    }
     
}